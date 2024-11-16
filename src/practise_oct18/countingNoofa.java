package practise_oct18;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countingNoofa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishrachapalli";
		
		
	Map<Character,Long>mymap=	input.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	System.out.println("a repeated : "+mymap.get('a')+" times ");
	
	
		
		
		

	}

}
