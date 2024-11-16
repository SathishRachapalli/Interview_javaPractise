package practise_sept26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class stringExercises
{
	static String reversing(String input)
	{
		String result=IntStream.range(0, input.length())
		.mapToObj(c->String.valueOf(input.charAt(input.length()-c-1)))
		.collect(Collectors.joining());
		
		return result;
	}
	
	static  String convertingToUpperCases(String input)
	{
		String result=input.chars().mapToObj(c->String.valueOf(Character.toUpperCase((char)c)))
				.collect(Collectors.joining());
		
		return result;
	}
	
	
	static String VowelsRemoval(String input)
	{
		String result=input.chars().mapToObj(c->String.valueOf((char)c))
		.filter(c->"aeiouAEIOU".indexOf(c)==-1)
		.collect(Collectors.joining());
		
		return result;
	}
	
	static String duplicatesRemoval(String input)
	{
		String result=input.chars().mapToObj(c->String.valueOf((char)c))
		.distinct().collect(Collectors.joining());
		
		return result;
	}
	
	
}



public class stringProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList=Arrays.asList("sathihs","summu","iterator","classes");
		
		myList.stream().map(stringExercises::duplicatesRemoval).forEach(System.out::println);
		
		


	}

}
