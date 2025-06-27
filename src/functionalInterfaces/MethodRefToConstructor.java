package functionalInterfaces;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefToConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//------------------default constructor calling using method references---------------------------------
		
		//Supplier<Student>mySupplier= ()->new Student();
		
		Supplier<StudentOne> mySupplier=StudentOne::new;
		
		System.out.println(mySupplier.get());
		
//--------------------------parameterized constructor using method references----------------------------------
		
		Function<Integer,StudentOne>myFunc=StudentOne::new;
		
		StudentOne result = myFunc.apply(26);
		
		System.out.println(result);
		
	

	}

}
