package generics_Concept;

class WaterMelon<T> {
	T value;

	public WaterMelon(T value) {
		super();
		this.value = value;
	}

	// The <T> mentioned in here is not depending on the class level declaration
	// like in the line no 5: WaterMelon<T>
	// The value Of 'T' is being overridden here.
	public static <T> void printSomething(T t) {
		System.out.println(t);
	}

	@Override
	public String toString() {
		return "WaterMelon [value=" + value + "]";
	}

}

public class StaticAndInstanceGenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterMelon<String> obj1 = new WaterMelon<String>("sathish");

		System.out.println(obj1);

		// The data-type: String which we are passing here does not affects the static
		// method: printSomething

		// we can still call our static method by mentioning our own data-type

		WaterMelon.printSomething(1000);

	}

}
