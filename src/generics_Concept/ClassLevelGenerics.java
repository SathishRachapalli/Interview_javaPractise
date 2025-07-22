package generics_Concept;

//whatever data-type we mentioned at the class-level will applies the same
//to method level passing parameters.

class Papaya<T> {
	public void showItem(T t) {
		System.out.println(t);
	}
}

public class ClassLevelGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Papaya<String> obj = new Papaya<String>();

		obj.showItem("Sathish");

		Papaya<Integer> obj1 = new Papaya<Integer>();
		obj1.showItem(1000);

	}

}
