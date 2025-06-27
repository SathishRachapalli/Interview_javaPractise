package practise;

import java.util.Arrays;
import java.util.List;

public class StudentStreamPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<StudentOne> myList=Arrays.asList(new StudentOne(1,"sathish")
				, new StudentOne(2,"pavan")
				,new StudentOne(3,"Anil")
				);
		
		
		
		
		myList.forEach(System.out::println);

	}

}
