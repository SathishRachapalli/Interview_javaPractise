package practise_sept26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class employee
{
	int Id;
	String Name;
	String Department;
	public employee(int id, String name, String department) {
		super();
		Id = id;
		Name = name;
		Department = department;
	}
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
		return "employee [Id=" + Id + ", Name=" + Name + ", Department=" + Department + "]";
	}
	
	
	
}

public class sortByFirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<employee>mycomp= Comparator.comparing(employee::getId);
		
		List<employee> myList=Arrays.asList(
				new employee(1,"sathish","cse"),
				new employee(-90,"mahesh","cse"),
				new employee(100,"ramesh","ece"),
				new employee(76,"Girish","ece")	);
		
		myList.stream().sorted(mycomp.reversed()).forEach(System.out::println);
		
		
				
				
				
				

	}

}
