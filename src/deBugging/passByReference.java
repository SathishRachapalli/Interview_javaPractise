package deBugging;


class byReference
{
	void show(passByReference obj)
	{
		obj.i=100;
	}
}

public class passByReference {
	
	int i=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byReference obj1 = new byReference();
		
		
		passByReference obj2 = new passByReference();
		
		System.out.println("value of i before modifying: "+obj2.i);

		obj1.show(obj2);
		
		System.out.println("value of i after modifying: "+obj2.i);

	}

}
