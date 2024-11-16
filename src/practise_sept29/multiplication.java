package practise_sept29;

import java.util.Arrays;
import java.util.List;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> myList=Arrays.asList(2,3,4);
		
		int result=myList.stream().reduce(1,(c,e)->c*e);
		
		System.out.println(result);

	}

}
