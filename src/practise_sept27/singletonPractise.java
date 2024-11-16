package practise_sept27;


 class singleton
{
	static singleton instance;
	
	private singleton()
	{
		
	}
	
	static singleton gettingMethodInstance()
	{
		if(instance==null)
		{
			instance=new singleton();
		}
		return instance;
		
	}
}
 /// There are some singleton breaking strategies also available
 //but throw the exception by saying we shouldn't create any new objects/instances of the class.

public class singletonPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleton obj=singleton.gettingMethodInstance();
		
		System.out.println(obj.hashCode());
		
		singleton obj2=singleton.gettingMethodInstance();
		System.out.println(obj2.hashCode());

	}

}
