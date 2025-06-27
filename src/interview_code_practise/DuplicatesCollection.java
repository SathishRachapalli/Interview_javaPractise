package interview_code_practise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="SathishRachapalli";
		
		Map<Character, Long> result = input.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		String duplicates = result.entrySet().stream().filter(n->n.getValue()>1)
				.map(n->String.valueOf(n.getKey()))
		.collect(Collectors.joining());
		
		System.out.println(duplicates);
		

	}

}
