package interview_preparation_codes;

import java.util.Arrays;

// 17 june 2025- bangalore-varthur PG- in room - 12:55 PM

public class TestingIntStreamAndStreamofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] integerArray=new Integer[] {1,2,3};
		
		int resultSum = Arrays.stream(integerArray)  // returns Stream<Integer>
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("Stream<Integer> result: "+resultSum);
		
		
		int[] intArray=new int[] {4,5,6};
		
		int sumResult=Arrays.stream(intArray)  // return IntStream
			  .sum();
		
		System.out.println("IntStream result: "+sumResult);
		
		

	}

}
