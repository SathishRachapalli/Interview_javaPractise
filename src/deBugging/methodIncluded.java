package deBugging;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class methodIncluded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> myList=Arrays.asList(3,6,-90,32,1);
		
		//Collections.sort(myList, Collections.reverseOrder());
		
		myList.forEach(System.out::println);

	}

}
