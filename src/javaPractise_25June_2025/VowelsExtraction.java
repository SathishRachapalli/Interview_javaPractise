package javaPractise_25June_2025;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VowelsExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="sathishRachapallilovesOppenheimer";
		
		    String result = Arrays.stream(input.split(""))
		    .filter(c->"aeiouAEIOU".indexOf(c)==-1)
		    .collect(Collectors.joining());
		    
		    System.out.println(result);

	}

}
