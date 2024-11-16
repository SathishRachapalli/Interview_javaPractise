package practise_oct18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class stringProblems
{
	
	static String reversing(String input)
	{
	String result=	IntStream.range(0, input.length()-1)
		.mapToObj(c->input.charAt(input.length()-c-1))
		.map(String::valueOf)
		.collect(Collectors.joining());
	
	return result;
	}
	
	static String UpperCasing(String input)
	{
		String result=input.chars().mapToObj(c->(char)c)
		.map(Character::toUpperCase).map(String::valueOf)
		.collect(Collectors.joining());
		
		return result;
	}
	
	
	static String duplicateRemovals(String input)
	{
		String result=input.chars().mapToObj(c->(char)c).distinct().
		map(String::valueOf).
		collect(Collectors.joining());
		
		return result;
	}
	

}

public class stringPractises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList=Arrays.asList("sathihs","suhass","lokesh","mahesh");
		
		
		myList.stream().map(stringProblems::UpperCasing).forEach(System.out::println);
	
		
	}

}
