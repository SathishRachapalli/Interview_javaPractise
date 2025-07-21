package generics_Concept;


//If we wanted the method-only to be generic, we can create the generic methods like below:

class Banana
{
	
	//<T> is for input-data-type to mention what data-type we are passing as arguments/method-parameters
	public <T> void show(T t)
	{
		System.out.println(t);
	}
}

public class SimpleGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Banana obj1 =new Banana();
		obj1.<String>show("sathish");
		obj1.show(20.2);
		obj1.show(100);

	}

}
