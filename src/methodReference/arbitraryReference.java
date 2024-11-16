package methodReference;

//interface dayThree {
//
//	int add(int n1, int n2);
//}

interface dayThree {

	int add(arbitraryReference obj, int n1, int n2);
}


public class arbitraryReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// one way
//		
//		arbitraryReference obj = new arbitraryReference();
//		
//		dayThree obj1=obj::addition;
//		
//		int result = obj1.add(1, 3);
//		
//		System.out.println(result);
//		

		//// -----------------------------------------USING ARBITRARY OBJECT REFERENCE--------------------------------------

		// while using this approach, the in-direct way of object would be passed(passing arbitrarily) into
		// the FUNCTIONAL INTERFACE
		// functional Interface should have been modified like below:

//		interface dayThree {
//
//			int add(arbitraryReference arbitraryObject, int n1, int n2);
//		}
		
		
		// now we can write the normal coding style like below:
		
		dayThree obj=arbitraryReference::addition;
		
		int result = obj.add(new arbitraryReference(), 1, 2);
		
		System.out.println(result);
		
	
	}

	int addition(int num1, int num2) {
		return num1 + num2;

	}

}
