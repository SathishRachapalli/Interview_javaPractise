package practise_sept27;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class student
{
	int Id;
	String Name;
	String Department;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "student [Id=" + Id + ", Name=" + Name + ", Department=" + Department + "]";
	}
	public student(int id, String name, String department) {
		super();
		Id = id;
		Name = name;
		Department = department;
	}
	
	
}

public class collectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<student>myList=Arrays.asList(
				
				new student(12,"raja","cse"),
				new student(34,"pooja","cse"),
				new student(89,"john","ece"),
				new student(40,"bakery","ece"));
		
		//myList.forEach(System.out::println);
		
		
		Comparator<student> mycomp = Comparator.comparing(student::getId);
		
		
		// printing the students by department wise
//		myList.stream().collect(Collectors.groupingBy(student::getDepartment))
//		.entrySet().forEach(System.out::println);
		
		
		
		// getting the firsthighest ID student from each department.
		
		
	Map<String, Optional<student>>myMap=	myList.stream().collect(Collectors.groupingBy(student::getDepartment,
				
				Collectors.collectingAndThen(Collectors.toList(), 						
						listOne->listOne.stream().sorted(mycomp.reversed()).skip(0).findAny())
));
	
	
	myMap.entrySet().forEach(System.out::println);
		
		
		
		

	}

}
