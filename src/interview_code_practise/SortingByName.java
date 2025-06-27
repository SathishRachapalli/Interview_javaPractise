package interview_code_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import practise.StudentOne;

public class SortingByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentOne>myList= Arrays.asList(
				
				new StudentOne(12,"Sathish"),
				new StudentOne(19,"Rusk"),
				new StudentOne(44,"Pratik"),
				new StudentOne(27,"Rudra")				
				);
		
		
	//myList.stream().sorted(Comparator.comparing(StudentOne::getName)).forEach(System.out::println);
		
		Comparator<StudentOne> myComp=Comparator.comparing(StudentOne::getName);
	
	myList.stream().sorted(myComp).map((StudentOne obj)->obj.getName()).forEach(System.out::println);


	}

}
