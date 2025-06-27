package interview_preparation_codes;

public class PrimitiveForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] myIntArray=new int[] {1,2,3};
		
		//myIntArray.forEach();   --compilation error due to in-compatibility
		//forEach() can only be applied on the classes that implements Iterable interface. which means any collection classes.
		//such as List,Set,etc
		
		String[] myStringArray= {"sathish","John"};
		
		//myStringArray.forEach();   -- gives us the same
		
		//we can use the enhanced for-loop for these.
		
		for(int value:myIntArray)
		{
			System.out.println(value);
		}

	}

}
