package methodReference;

//-------------------------------------------STATIC METHOD REFERENCING---------------------------------------


interface dayOne
{
	int add(int s1,int s2);
}

public class methodReferenceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dayOne obj=methodReferenceConcept::add;
		int result = obj.add(3, 2);
		
		System.out.println(result);
	}
	
	
	static int add(int n1,int n2)
	{
		return n1+n2;
		
	}

}
