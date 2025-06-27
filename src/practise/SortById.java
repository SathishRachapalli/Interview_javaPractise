package practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<StudentOne> myList= Arrays.asList(
				
				new StudentOne(23,"john")
				,new StudentOne(45,"Rahul")
				,new StudentOne(10,"Ravi")
				,new StudentOne(3,"pavan")
				,new StudentOne(40,"Abella")
				
				);
		
		
		//Comparator<Student> myComp=Comparator.comparing(Student::getId);
		
		Comparator<StudentOne>myComp1=Comparator.comparing(obj->obj.getId());
		
		myList.stream().sorted(Comparator.comparing(StudentOne::getId).reversed()).forEach(System.out::println);
		
		
		
		//Descending Order
		
		
		System.out.println("\n Descending Order ..............\n");
		
	//	myList.stream().sorted(myComp.reversed()).forEach(System.out::println);
		
		
		
		

	}

}
