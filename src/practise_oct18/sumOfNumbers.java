package practise_oct18;

import java.util.Arrays;

public class sumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="5,23,15,6";
		
		
		int result=Arrays.stream(input.split(","))
		.map(Integer::valueOf)
		.reduce(0,(c,e)->c+e);
		
		System.out.println(result);
		

	}

}
