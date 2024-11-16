package practise_sept27;

import java.util.Arrays;
import java.util.List;

public class counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="absathish";
		
		long counting=input.chars().mapToObj(c->(char)c).filter(c->c=='a').count();
		
		System.out.println(counting);
		
		
//		List<Integer> myList=Arrays.asList(45,12,-90,89,-67,-89,10,5);
//		
//		myList.stream().filter(c->c<=10).forEach(System.out::println);

	}

}
