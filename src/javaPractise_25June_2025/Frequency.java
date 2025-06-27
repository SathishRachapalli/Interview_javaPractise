package javaPractise_25June_2025;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="SathishRachapalli";
		
		
		input.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.forEach(n->System.out.println(n.getKey()+"  "+n.getValue()));
	

	}

}
