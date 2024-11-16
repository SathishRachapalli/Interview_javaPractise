package practise_sept29;

import java.util.List;
import java.util.Optional;

public class reduceMethod {

	public static void main(String[] args) {
		
		
		List<Integer> myList=List.of(5,1,4);
		
		
		Optional<Integer> result = myList.stream().reduce(Integer::sum);
		
		System.out.println(result.get());
		
		
		

	}

}
