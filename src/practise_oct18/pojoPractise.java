package practise_oct18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class student
{
	int Id;
	String Name;
	public student(int id, String name) {
		super();
		Id = id;
		Name = name;
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
	@Override
	public String toString() {
		return "student [Id=" + Id + ", Name=" + Name + "]";
	}
	
}

public class pojoPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<student> myList=Arrays.asList(
				
				new student(67,"sahish"),
				new student(23,"lokesh"),
				new student(90,"Bhupesh")	);
		
		
		Comparator<student> mycomp = Comparator.comparing(student::getId);
		
		myList.stream().sorted(mycomp.reversed()).forEach(System.out::println);
		
		
		
		
		
	}

}
