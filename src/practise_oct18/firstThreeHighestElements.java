package practise_oct18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class firstThreeHighestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList=Arrays.asList(5,32,-90,12,78,90,34,21,78);
		
		
		myList.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).
		forEach(System.out::println);
		
		
		

	}

}
