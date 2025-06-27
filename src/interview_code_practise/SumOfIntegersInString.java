package interview_code_practise;

import java.util.Arrays;

public class SumOfIntegersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="1,23,10,10";
		
		
		int result=Arrays.asList(input.split(",")).stream().map(Integer::valueOf).reduce(0,(a,b)->a+b);
		
		System.out.println(result);
		
		

	}

}
