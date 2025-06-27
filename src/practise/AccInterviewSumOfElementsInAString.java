package practise;

import java.util.Arrays;
import java.util.stream.Stream;

public class AccInterviewSumOfElementsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] myInput= {"10","10"};
		
		 Integer sumResult = Arrays.asList(myInput).stream()
		 .map(Integer::valueOf)
		 .mapToInt(Integer::intValue)   // if we want to use sum(), we have to convert the wrapper classes to primitive data types.
		 .sum();
		 
		 System.out.println(sumResult);
		 
		 
		 //another implementation using reduce()
		 
		 Integer sumResult1 = Arrays.asList(myInput).stream()
		 .map(Integer::valueOf)
		 .reduce(0,(a,b)->a+b);
		 
		 System.out.println(sumResult1);

		 
	
	}

}
