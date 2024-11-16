package practise_sept21;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class stringPractise_sept21
{
	
	static String reversing(String input)
	{
		String result=IntStream.range(0, input.length())
		.mapToObj(c->String.valueOf(input.charAt(input.length()-c-1)))
		.collect(Collectors.joining());
		
		return result;
	}
	
	static String removalofVowels(String input)
	{
		
		
		String result=input.chars().mapToObj(c->String.valueOf((char)c)).filter(c->"aeiouAEIOU".indexOf(c)==-1)
		.collect(Collectors.joining());
		
		return result;
	}
	
	static String removingDuplicates(String input)
	{
		String result=input.chars().mapToObj(c->String.valueOf((char)c))
		.distinct().collect(Collectors.joining());
		
		return result;
		
	}
	
}

public class stringPractises {
	
	public static void main(String[] args) {
		
	
		List<String> myList=Arrays.asList("sathish","lokes","mom","dadaddy","sunny");
		
		myList.stream().map(stringPractise_sept21::removingDuplicates).forEach(System.out::println);
		
	}

}
