package methodReference;

interface dayTwo
{
	int add(int num1, int num2);
}

public class instanceMethodReferencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		instanceMethodReferencing instanceReference = new instanceMethodReferencing();
		
		
		dayTwo obj=instanceReference::addition;
		
		int result = obj.add(2, 4);
		
		System.out.println(result);
		
		

	}
	
	
	
	int addition(int num1, int num2)
	{
		return num1+num2;
		
	}

}
