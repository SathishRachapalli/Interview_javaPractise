package practise_sept29;

import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicatesremoval {
	
	public static void main(String[] args) {
		
		
		String input="sathishRachapalliq";
		
		String result=input.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(c->c.getValue()==1).map(c->c.getKey())
		.map(String::valueOf).collect(Collectors.joining());
		
		System.out.println(result);

		
		
	String resultOne= input.chars().mapToObj(c->String.valueOf((char)c))
		.reduce(new StringBuilder(), (sb,c)->{
			
			if(sb.indexOf(c)==-1)
			{
				sb.append(c);
				
			}
			
			return sb;

		}, StringBuilder::append).toString();
	
	
	System.out.println(resultOne);


	

		
	}
	
	


}
