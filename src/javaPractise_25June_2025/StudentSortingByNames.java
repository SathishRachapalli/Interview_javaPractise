package javaPractise_25June_2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import interview_code_practise.Student;

public class StudentSortingByNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student> myList=Arrays.asList(
				
				new Student("first","testOne",78),
				new Student("first","testTwo",71),
				new Student("Second","testOne",21),
				new Student("Third","fourthOne",22),
				new Student("first","testOne",66),
				new Student("Seventh","sevenOne",34),
				new Student("Eight","eightOne",23)
				);
		
		
		Comparator<Student> myComp=Comparator.comparing(Student::getFirstName)
				.thenComparing(Student::getLastName)
				.thenComparing(Student::getAge);
		
		
		
		myList.stream().sorted(myComp).forEach(System.out::println);
		

	}

}
