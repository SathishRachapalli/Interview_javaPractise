package generics_Concept;

class Apple {
	public void show(int a) {
		System.out.println(a);
	}

	public void show(double a) {
		System.out.println(a);
	}

	public void show(String a) {

		System.out.println(a);

	}

}

public class NormalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we need to overload the methods if we want to pass each data-type like below:
		
		
		Apple obj=new Apple();
		obj.show(20.2);
		obj.show("sathish");
		obj.show(100);
		

	}

}
