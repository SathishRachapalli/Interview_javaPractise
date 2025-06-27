package ArraysStreamUsage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="sathishish";
		
		Set<String>mySet=new LinkedHashSet<>();
		
		String result = Arrays.stream(input.split(""))
		.filter(c->!mySet.add(c))
		.collect(Collectors.joining());
		
		System.out.println(result);
		
		
		
		

	}

}
