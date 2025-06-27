package javaPractise_25June_2025;

import java.util.Arrays;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="12,10,10";
		
		  int result = Arrays.stream(input.split(","))
		  .mapToInt(Integer::valueOf)
		  .sum();
		  
		  
		  System.out.println(result);
		  
		
		
	
	}

}
