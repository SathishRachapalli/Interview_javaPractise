package practise_june26_2025;

import java.util.Arrays;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="3432sdfa";
		
		
		int result = Arrays.stream(input.split(""))
		.filter(n->"0123456789".indexOf(n)!=-1)
		.mapToInt(Integer::valueOf)
		.sum();
		
		System.out.println(result);
		
		
		

	}

}
