package practise_sept29;

import java.util.stream.Collectors;

public class collectingAfromInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="satishrachapalli";
		
		String result=input.chars().mapToObj(c->String.valueOf((char)c)).filter(c->c.equals("a")).
				collect(Collectors.joining());
		
		System.out.println(result);

	}

}
