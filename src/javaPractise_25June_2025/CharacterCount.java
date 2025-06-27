package javaPractise_25June_2025;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathish";
		
		long result = Arrays.stream(input.split(""))
		.filter(c->c.equalsIgnoreCase("a"))
		.count();
		
		System.out.println(result);

	}

}
