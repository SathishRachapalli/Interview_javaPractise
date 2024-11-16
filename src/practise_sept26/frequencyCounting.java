package practise_sept26;

import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishRachapalli";
		
		input.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().forEach(c->System.out.println(c.getKey()+ "  repeated  "+c.getValue()+" times"));

	}

}
