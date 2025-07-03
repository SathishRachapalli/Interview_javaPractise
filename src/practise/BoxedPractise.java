package practise;

import java.util.stream.IntStream;

public class BoxedPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.range(0, 6).boxed().map(Object::hashCode).forEach(System.out::println);

	}

}
