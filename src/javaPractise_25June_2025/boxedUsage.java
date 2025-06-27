package javaPractise_25June_2025;

import java.util.stream.IntStream;

public class boxedUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IntStream.range(0, 10)
		.boxed()
		.map(Object::hashCode)
		.forEach(System.out::println);

	}

}
