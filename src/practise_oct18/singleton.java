package practise_oct18;


class singletonOne
{
	private static singletonOne getInstance;

	private singletonOne()
	{
		
	}
	
	public static singletonOne gettingInstance()
	{
		if(getInstance==null)
		{
			getInstance=new singletonOne();
		}
		
		return getInstance;
	}
	
	
}

public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		singletonOne obj1=singletonOne.gettingInstance();
		System.out.println(obj1.hashCode());
		
		singletonOne obj2 = singletonOne.gettingInstance();
		System.out.println(obj2.hashCode());

	}

}
