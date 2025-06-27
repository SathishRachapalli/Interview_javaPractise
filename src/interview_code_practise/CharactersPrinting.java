package interview_code_practise;

import java.util.Optional;
import java.util.stream.IntStream;

public class CharactersPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="87";
		
		Optional<Integer> result = input.chars().mapToObj(c->(char)c)
		.map(c->c-'0')
		.reduce((a,b)->a+b);
		
		System.out.println(result.get());
		
	
	
		
		
	

	}

}
