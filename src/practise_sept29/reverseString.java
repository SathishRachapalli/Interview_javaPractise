package practise_sept29;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="sathishRachapalli";
		
		String result=IntStream.range(0, input.length())
		.mapToObj(c->input.charAt(input.length()-c-1))
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
