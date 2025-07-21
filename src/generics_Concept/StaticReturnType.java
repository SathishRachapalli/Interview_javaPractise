package generics_Concept;

class Pomegranate {
	//<T> -for input data-type mentioning , T is for output data-type mentioning
	public static <T> T show(T t) {
		return t;
	}
}

public class StaticReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pomegranate.show("Sathish"));
		System.out.println(Pomegranate.show(20.2));
		System.out.println(Pomegranate.show(1000));

	}

}
