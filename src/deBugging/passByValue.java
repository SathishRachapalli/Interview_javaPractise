package deBugging;

public class passByValue {
	
	
	 void modifying(int value)
	{
		value+=2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		passByValue obj = new passByValue();
		
		int i=10;
		
		System.out.println("i before modifying: "+i);
		
		
		obj.modifying(i);
		
		System.out.println("i after modifying: "+i);
		
		

	}

}
