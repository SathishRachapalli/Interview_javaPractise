package interview_code_practise;

import java.util.Comparator;
import java.util.List;

public class FirstNHighestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> myList=List.of(1,67,89,43,21);
		
		
		//first 2 highest elements in the array
		
		myList.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);

	}

}
