package practise_sept29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class topThreeMostOccuredStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> myList=Arrays.asList("sathish","sathish","sathish","Lokesh","Lokesh","Ravi","Ravi","rakesh",
				"suresh");
		
		
		myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.limit(3).forEach(c->System.out.println(c.getKey()));
		
		
		
	}

}
