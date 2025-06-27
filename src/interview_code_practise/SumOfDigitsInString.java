package interview_code_practise;

import java.util.Optional;
import java.util.stream.Stream;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input=421;
		
		int result = String.valueOf(input).chars()
		.map(c->c-'0')
		.reduce(0,(a,b)->a+b);
		
		
		System.out.println(result);

	}

}
