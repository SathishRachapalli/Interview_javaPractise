package methodReference;

import java.util.function.BiFunction;

public class stringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*  public String concat(String str) {
		        if (str.isEmpty()) {
		            return this;
		        }
		        return StringConcatHelper.simpleConcat(this, str);
		    }   */
		
		
		String str1="hi";
		String str2="sathish";
		
		
		// Now we are planning to call concat() from String class using method reference.
		
		// we cannot call like 'String::concat' this type, since its not  a static method
		
		//we can make use of existing functionalInterface i.e., BiFunction
		
		BiFunction<String, String, String > bifunction=(str3,str4)->{return str3.concat(str4);};
		
		String result = bifunction.apply(str1, str2);
		
		//System.out.println(result);
		
		// T- first Function argument
		// U- second function argument
		// R - Result
		//  R apply(T t, U u);   -- method we have to implement using lambda expression or method reference
		
		
		// now we will try to implement using method reference way
		
		BiFunction<String, String, String> concatenating= String::concat;
		String resultOne = concatenating.apply(str1, str2);
		
		System.out.println(resultOne);
		
		
		

	}

}
