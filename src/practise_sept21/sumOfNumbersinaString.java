package practise_sept21;

import java.util.Arrays;

public class sumOfNumbersinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="1,34,21";
		
		
		int result=Arrays.stream(input.split(",")).map(Integer::valueOf).reduce(0,(c,w)->c+w);
		
		System.out.println(result);

	}

}
