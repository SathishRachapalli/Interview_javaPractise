package javaPractise_25June_2025;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UpperCasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="sathish";
		
		String result = Arrays.stream(input.split(""))
		.map(String::toUpperCase)
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
