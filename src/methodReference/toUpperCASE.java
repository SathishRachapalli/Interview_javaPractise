package methodReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class toUpperCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String str1="sathish";
	
	
	String result = str1.toUpperCase();
	
	//System.out.println(result);
	
	
	// to implement this we need to look for suitable functional Interfaces in our java.
	// to suit the exact situation , we can go for Supplier functional interface
	
	
	///Supplier   ---- >    T get();	
	
	
	//using lambda expression
	
	
	Supplier<String> myString=()->{return str1.toUpperCase();};
	
	String resultOne = myString.get();
	
	//System.out.println(resultOne);
	
	
	// using method reference
	
	Supplier<String> myStringOne=str1::toUpperCase;
	//System.out.println(myStringOne.get());
	
	//but here, str1 is directly object ....--> str1, but we should have to do something like below:
	// String::concat  -->In order to do so, we have to search for the suitable functional interface
	// i.e., it is taking one string argument, therefore we can select the function<T,R>
	
	Function<String,String> myFunc=String::toUpperCase;
	String resultTwo = myFunc.apply(str1);
	System.out.println(resultTwo);
	
	
	
	
	
	

	}

}
