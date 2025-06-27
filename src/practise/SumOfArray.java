package practise;

import java.util.Arrays;
import java.util.List;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> myList=Arrays.asList(3,4,2,1);
		
		int result = myList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result);
		

	}

}
