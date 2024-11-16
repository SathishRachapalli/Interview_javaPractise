package practise_sept29;


class apple
{
	
	apple()
	{
		System.out.println("constructor...");
	}
	
	
	static
	{
	System.err.println("this version is deprecated . please use another one");
	}
}

public class staticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 apple obj = new apple();

	}

}
