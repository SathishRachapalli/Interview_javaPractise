package generics_Concept;


class Grapes
{
	public static  <T> void show(T t)
	{
		System.out.println(t);
	}
}

public class StaticGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grapes.show("sathish");
		Grapes.show(20.2);
		Grapes.show(1000);

	}

}
