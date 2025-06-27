package ArraysStreamUsage;

import java.util.Arrays;

public class CountOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="sathish";
		
		long result = Arrays.stream(input.split(""))
		.filter(c->c.equals("a"))
		.count();
		
		System.out.println(result);

	}

}
