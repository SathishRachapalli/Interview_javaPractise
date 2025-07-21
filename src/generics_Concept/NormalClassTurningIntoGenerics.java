package generics_Concept;


class Orange<T> {
	
	public void show(T t)
	{
		System.out.println(t);
	}
	

}

public class NormalClassTurningIntoGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can apply/create the generics like this to avoid method-overriding and its data-type mismatching issues
		
		Orange<String> myObj=new Orange<String>();
		myObj.show("sathish");
		
		Orange<Integer> myObj2=new Orange<Integer>();
		myObj2.show(100);
		
		Orange<Double> myObj3=new Orange<Double>();
		myObj3.show(20.2);
		
		

	}

}
