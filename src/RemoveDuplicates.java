import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> intList=new ArrayList();
		intList.add(10);
		intList.add(20);intList.add(30);
		intList.add(50);intList.add(40);
		intList.add(20);intList.add(10);
		intList.add(60);
		System.out.println("list before removing duplicate values"+intList);
		intList=removeDuplicates(intList);
		System.out.println("list after removing duplicate values"+intList);
		
	}
	
	public static List<Integer> removeDuplicates(List<Integer> integerList){
		List<Integer> tempList=new ArrayList<Integer>();
		for(int i=0;i<integerList.size();i++) {
			if(!tempList.contains(integerList.get(i))) {
				tempList.add(integerList.get(i));
			}
		}
		return tempList;
	}
}
