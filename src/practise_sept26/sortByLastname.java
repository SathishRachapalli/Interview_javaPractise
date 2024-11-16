package practise_sept26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class names
{
	String firstName;
	String lastName;
	public names(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "names [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}

class student
{
	int Id;
	 names Names;
	String Department;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public names getNames() {
		return Names;
	}
	public void setNames(names names) {
		Names = names;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public student(int id, names names, String department) {
		super();
		Id = id;
		Names = names;
		Department = department;
	}
	@Override
	public String toString() {
		return "student [Id=" + Id + ", Names=" + Names + ", Department=" + Department + "]";
	}
	

	
}




public class sortByLastname {
	
	public static void main(String[] args) {
		
	
		List<student> myList=Arrays.asList(
				
				new student(-9,new names("sathish","rachapalli"),"cse"),
				new student(45,new names("vamsi","rachapalli"),"cse"),
				new student(21,new names("pav","gadiparthi"),"ece"),
				new student(64,new names("lemon","ravipudi"),"ece"),
				new student(45,new names("vamsi","ravipudi"),"cse"));
		
		Comparator<student>mycomp=(s1,s2)->{
					
					int firstComparison=s1.getNames().firstName.compareTo(s2.getNames().firstName);
					
					if(firstComparison==0)
					{
						return s1.getNames().lastName.compareTo(s2.getNames().lastName);
					}
					return firstComparison;
				};

		myList.stream().sorted(mycomp).forEach(System.out::println);
		
	}

}
