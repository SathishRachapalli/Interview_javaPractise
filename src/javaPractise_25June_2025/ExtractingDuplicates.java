package javaPractise_25June_2025;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ExtractingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishhs";
		
		
		LinkedHashSet<Character> myHashSet=new LinkedHashSet<>();
		
		
		
		String result = input.chars()
		.mapToObj(c->(char)c)
		.filter(c->!myHashSet.add(c))
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(result);
		

	}

}
