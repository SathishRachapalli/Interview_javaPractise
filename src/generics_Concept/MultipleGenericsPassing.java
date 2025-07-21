package generics_Concept;


class Almond
{
	
	
	//way of using multiple generics from here
	public static <T,U> void show(T t, U u)
	{
		System.out.println(t);
		System.out.println(u);
	}
}

public class MultipleGenericsPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Almond.show("sathish", 1000);
		Almond.show("Sathish", "test");

	}

}
