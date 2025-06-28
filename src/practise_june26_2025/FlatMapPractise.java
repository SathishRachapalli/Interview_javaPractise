package practise_june26_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myListOne = Arrays.asList("One", "Two");
		List<String> myListTwo = Arrays.asList("Three", "Four");

		Stream.of(myListOne, myListTwo).flatMap(

				/*new Function<List<String>, Stream<String>>() {

					public Stream<String> apply*/(List<String> myList)-> //{
					/*
					 * List<String> result = new ArrayList<>();
					 * 
					 * for (String item : myList) { result.add(item); }
					 */
						 myList.stream()

					//}

				//}

		).forEach(System.out::println);
		
		
		
		// this can be further simplified as below:
		
		
		System.out.println("\n\n\n\n");
		
		
		Stream.of(myListOne, myListTwo)
		.flatMap(List::stream)   // List(I) extends to Collection(I) that has a default stream() in it 
		//and hence we can take it as a method-reference
		.forEach(System.out::println);
		
		
		
		
		
		

	}

}
