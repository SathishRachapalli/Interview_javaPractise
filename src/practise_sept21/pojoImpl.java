package practise_sept21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class student
{
	int studentId;
	String name;
	
	
	public student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	
	
	
}

public class pojoImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Comparator<student>mycomp=	Comparator.comparing(student::getStudentId);
		
		List<student> myList=Arrays.asList(
				new student(12,"sathish"),
				new student(67,"lokesh"),
				new student(2,"chetan")
				);

	
		//sorting by id in descending order
		myList.stream().sorted(mycomp.reversed()).forEach(System.out::println);
		
		
	}

}
