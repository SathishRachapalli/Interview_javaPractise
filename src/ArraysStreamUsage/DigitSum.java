package ArraysStreamUsage;

import java.util.Arrays;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sjfkl81,sd3";
		
		int result = Arrays.stream(input.split(""))
		.filter(c->"0123456789".indexOf(c)>=0)
		.mapToInt(Integer::valueOf)
		.sum();
		
		System.out.println(result);
		

	}

}
