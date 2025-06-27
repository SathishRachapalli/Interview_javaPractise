package practise;

import java.util.Arrays;
import java.util.List;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String>myInput=List.of("hi sathish","welcome here");
		
		myInput.stream().flatMap(str->Arrays.asList(str.split(" ")).stream())
		.forEach(System.out::println);

	}

}
