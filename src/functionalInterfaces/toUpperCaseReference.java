package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class toUpperCaseReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Function<String,String> mySupp= String::toUpperCase; 
		 * String result = mySupp.apply("sathish");
		 * System.out.println(result);
		 */
		
		//which functional interface we are using MATTERS HERE!
		
		/*
		 * Supplier<String>mySupp= String::toUpperCase;(this method is not a static one,
		 * so we need to pass some string value to it!).
		 */   
		   Supplier<String> mySuppOne="SunnyLeone"::toUpperCase;
		   String result=mySuppOne.get();
		   
		   System.out.println("using Supplier: "+result +"\n");
		
		
		List<String> myList=Arrays.asList("sathish","john","Kendra","Agatha");
		
		//myList.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		
		// converting the above function to method reference
		
		myList.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
	}

}
