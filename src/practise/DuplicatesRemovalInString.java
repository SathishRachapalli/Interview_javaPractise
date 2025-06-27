package practise;

import java.util.stream.Collectors;

import utils.CharToStringUtil;

public class DuplicatesRemovalInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String input="sathish";
		
		String result = input.chars()
				.mapToObj(CharToStringUtil::CharToString)
				.distinct()
				.collect(Collectors.joining());
		
		System.out.println(result);
				
	}

}
