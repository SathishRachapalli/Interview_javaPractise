package interview_preparation_codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//17 june 2025- bangalore-varthur PG- in room - 12:55 PM


public class sumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList=new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		
		// If we want to use the sum() on the wrapper objects, we need to un-box them manually using mapToInt() 
		int result = myList.stream().mapToInt(Integer::valueOf).sum();
		System.out.println("result using sum(): "+result);
		
		
		Optional<Integer> resultReduce = myList.stream().reduce(Integer::sum);
		
		//reduce accepts the BiFunction -functional interface 
		// so we can write as reduce ((n1,n2)->{return n1+n2;})
		//since the static method of Integer : sum accepts two inputs and return a result similiar to existing 
		//reference to accept the BiFunction implementation, we can re-write it as Integer::sum.
		//Also we can add the initial zero like below:
		// reduce(0,(n1,n2)->n1+n2);  -- gives the same output.
		
		int resultSum= resultReduce.isEmpty()?0:resultReduce.get();
		System.out.println("resultSum using reduce():  "+resultSum);
		
		
	}

}
