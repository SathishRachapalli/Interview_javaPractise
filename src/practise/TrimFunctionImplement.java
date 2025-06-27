package practise;

import java.util.stream.Stream;

public class TrimFunctionImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream.of("  Sathish  ","     John")
		.map(String::trim)
		.forEach(System.out::println);
		

	}

}
