package interview_code_practise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="SathishRachapalli";
		
		long result = input.chars().filter(c->c=='a').count();
		
		//Explanation: since characters/literals in java works based on the unicode representation
		//even though we received an IntStream of characters from chars(), 
		//Java automatically converts the int-unicode representation of characters to its literals
		//i.e, for literal 'a', it considers 97(unicode value)
		//so basically, it does c->c==97 --->it is doing on the basis of unicode values implicitly.
		
		System.out.println("a : "+result);
		
		//System.out.println(result);
		
		 String length = input.chars().filter(c->c=='a').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		 
		 System.out.println("a "+length.length());
		
		
	}

}
