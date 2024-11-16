package practise_sept29;

import java.util.function.Function;
import java.util.stream.Collectors;

public class collectingcountValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishrachapalli";
		
		
		long result = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream().filter(rec->rec.getKey().equals("a"))
		.map(rec->rec.getValue()).count();
		
		System.out.println(result);

	}

}
