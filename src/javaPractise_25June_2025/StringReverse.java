package javaPractise_25June_2025;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathish";
		
		String result = IntStream.range(0, input.length())
		.mapToObj(c->input.charAt(input.length()-1-c))
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
