package practise;

import java.util.Arrays;
import java.util.List;

public class StudentOnePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<StudentOne> myList= Arrays.asList(new StudentOne(1,"sathish")
				,new StudentOne(45,"John")
				,new StudentOne(56,"Laura")
				);
		
		
		
		myList.stream().map(StudentOne::getId).forEach(System.out::println);

	}

}
