package practise_sept21;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countOfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishRachapalli";
		
		
		//Map<Character,Long>myMap=
		
		input.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().forEach(c->{
			if(c.getKey()=='a')
			{
				System.out.println(c.getKey()+" repeated "+c.getValue()+"  times.");
			}
			
			
		});
		

	
	}

}
