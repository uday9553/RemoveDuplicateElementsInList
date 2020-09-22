import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList();
		intList.add(10);
		intList.add(20);intList.add(30);
		intList.add(50);intList.add(40);
		intList.add(20);intList.add(10);
		intList.add(60);
		System.out.println("list before removing duplicate values"+intList);
		Collections.sort(intList);
		intList=intList.stream().distinct().collect(Collectors.toList());
		System.out.println("list after removing duplicate values"+intList);
		
	}
	
	

}
