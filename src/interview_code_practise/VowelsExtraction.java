package interview_code_practise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VowelsExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="iujko";
		
		String result = Arrays.stream(input.split(""))
		.filter(n->"aeiouAEIOU".indexOf(n)==-1)
		.collect(Collectors.joining());
		
		System.out.println(result);

	}

}
