package javaPractise_25June_2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstNHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer>myList=Arrays.asList(12,-34,1,9,34);
		
		myList.stream()
		.sorted(Comparator.reverseOrder())
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		

	}

}
