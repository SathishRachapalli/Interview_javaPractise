package practise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathish";
		
		String result = Arrays.stream(input.split(""))
		.sorted()  // can apply Comparator.reverseOrder() for the descending order.
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
