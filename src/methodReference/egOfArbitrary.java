package methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

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

public class egOfArbitrary {

	public static void main(String[] args) {
		
		
		List<student> myList=Arrays.asList(
				new student(23,"sathish"),
				new student(56,"lokesh"),
				new student(12,"seetha"),
				new student(-90,"panja"));
		
		
		Comparator<student> mycomp = Comparator.comparing(student::getId);  // Here object was created ARBITRARILY
		//to call the getId() from student class.
		
		//the functional interface should be like below:
		
	//	Function<student,String> myfunc=(student)->{return student.getName();};
		
		//it can be implemented into method reference like below:
			
	Function<student,String> myfunc=student::getName;

			
		String result = myfunc.apply(new student(34,"sathish"));
	//	System.out.println(result);
		
		myList.stream().sorted(mycomp).map(myfunc).forEach(System.out::println);
		
	}

}
