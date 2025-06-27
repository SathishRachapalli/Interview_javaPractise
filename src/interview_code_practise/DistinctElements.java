package interview_code_practise;

import java.util.stream.Collectors;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="SathishLovesOppenheimer";
		
		
		String result = input.chars().mapToObj(c->String.valueOf((char)c))
		.distinct().collect(Collectors.joining());
		
		System.out.println(result);
		
		
		

	}

}
