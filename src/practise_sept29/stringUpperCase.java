package practise_sept29;

import java.util.stream.Collectors;

public class stringUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sajlsjflkd";
		
		
		String result=input.chars().mapToObj(c->(char)c)
		.map(Character::toUpperCase)
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
