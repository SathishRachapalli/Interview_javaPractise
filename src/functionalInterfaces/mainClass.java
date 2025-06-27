package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	function func=(s)-> mainClass.show(s);
		
		ArrayList<Integer> myList=new ArrayList<>();
		myList.add(45);
		
		BiFunction<ArrayList<Integer>,Integer,Boolean> myFunc=ArrayList::add;
		
		Boolean result = myFunc.apply(myList, 78);
		
		System.out.println(result);
		
		//Function<String,String> myFunc= mainClass::show;
//		String result= myFunc.apply("Hi");
//		
//		System.out.println(result);
//		
	}
	
	
	static String show(String input)
	{
		return input +" Sathish";
	}

}
