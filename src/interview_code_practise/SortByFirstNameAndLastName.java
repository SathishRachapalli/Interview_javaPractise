package interview_code_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByFirstNameAndLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student> myList=Arrays.asList(
				
				new Student("Rachapalli","John",20),
				new Student("Rachapalli","John",67),
				new Student("Gummala","Sathish",24),
				new Student("Polepalli","masala",78),
				new Student("Gummala","Darshan",90)				
				);
		
		
		
		//we can use thenComparing() upto n number of sortings.
		Comparator<Student> myComp=Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName)
				.thenComparing(Student::getAge);
		
		
		myList.stream().sorted(myComp.reversed()).
		map(Student::getFirstName).distinct().forEach(System.out::println);
					
		
		

	}

}
