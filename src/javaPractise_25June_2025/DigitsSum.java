package javaPractise_25June_2025;

import java.util.Arrays;

public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="231";
		
		
		 int result = Arrays.stream(input.split(""))
		 .mapToInt(Integer::valueOf)
		 .sum();
		 
		 System.out.println(result);

	}

}
