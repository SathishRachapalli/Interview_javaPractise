package interview_preparation_codes;

import java.util.stream.IntStream;

//17 june 2025- bangalore-varthur PG- in room - 12:55 PM


public class BoxingIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.rangeClosed(0, 5)
		.boxed()  // will converts IntStream to Stream<Integer> so that we can make use of object/Integer class.
		.map(Object::hashCode)
		.forEach(System.out::println);

	}

}
