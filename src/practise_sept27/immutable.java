package practise_sept27;

final class immutableClass
{
	final String Name;
	 
	 immutableClass(String Name)
	 {
		 this.Name=Name;
	 }
	 
	 final void show()
	 {
		 System.out.println("immutable method.");
	 }	 
}

// making all the fields 'final' will makes the class as IMMUTABLE

//String is immutable class in java.
//if you try to modify the content of a string, it will creates a new object(check with hashcode if you want to test)
//Therefore, it leaves the previously/old object references as it is and it would be promoted to "STRING RE-USABILITY"

public class immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		immutable obj1 = new immutable();
		
		System.out.println(obj1.hashCode());
		
		immutable obj2 = new immutable();
		
		System.out.println(obj2.hashCode());

		

	}

}
