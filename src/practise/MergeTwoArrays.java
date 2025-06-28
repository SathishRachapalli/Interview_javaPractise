package practise;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] array1= {"Tokyo","Nairobi"};
		String[] array2= {"Moscow","Helsinki"};
		
		
		 Stream.of(array1,array2).flatMap(n->{
			
			return Arrays.asList(n).stream();
			
			
		}).forEach(System.out::println);
		 
		 System.out.println("\n\n");
		 
		 // this simplification also works
		 Stream.of(array1,array2)
		 .flatMap(Arrays::stream)
		 .forEach(System.out::println);

	}

}
