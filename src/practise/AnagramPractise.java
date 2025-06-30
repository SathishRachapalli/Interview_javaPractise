package practise;

import java.util.function.Function;
import java.util.stream.Collectors;


// Anagram -- Two strings should contain same letters (with same length)

public class AnagramPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputOne = "silent";
		String inputTwo = "listen";

		boolean result = inputOne.trim().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).equals(

						inputTwo.trim().chars().mapToObj(c -> (char) c)
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

				);

		System.out.println(result ? "Its Anagram" : "Its not an Anagram");

	}

}
