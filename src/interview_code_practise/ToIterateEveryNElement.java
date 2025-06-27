package interview_code_practise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToIterateEveryNElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//printing every even element from the string
		String input="Sathish";
		
		String result = IntStream.range(0, input.length())
		.filter(n->n%2!=0)
		.mapToObj(c->input.charAt(c))
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
