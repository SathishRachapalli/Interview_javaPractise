package practise_sept21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class printingFirstThreeHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>myList=Arrays.asList(3,4,5,8,9,7,6,5,4,3,3,3,12,2,3,56);
		
		myList.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).forEach(System.out::println);

	}

}
