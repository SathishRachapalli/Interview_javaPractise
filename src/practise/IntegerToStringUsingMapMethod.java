package practise;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntegerToStringUsingMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Arrays.asList(1,2,4).stream().map(n-> "value is : "+n).forEach(System.out::println);

	}

}
