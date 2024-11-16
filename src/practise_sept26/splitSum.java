package practise_sept26;

import java.util.Arrays;

public class splitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="8,23,12,67,21,34";
		
		
		int result=Arrays.stream(input.split(",")).map(Integer::valueOf).reduce(0,(c,e)->c+e);
		
		System.out.println(result);
	

	}

}
