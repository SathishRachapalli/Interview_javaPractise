package javaPractise_25June_2025;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishrachapalli";
		
		String result = input.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(n->n.getValue()>1)
		.map(n->n.getKey())
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(result);
		
		
		

	}

}
