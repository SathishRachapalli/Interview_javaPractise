package generics_Concept;

class BlueBerries<T, U> {
	private T value1;
	private U value2;

	public BlueBerries(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value1) {
		this.value1 = value1;
	}

	public U getValue2() {
		return value2;
	}

	public void setValue2(U value2) {
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return "BlueBerries [value1=" + value1 + ", value2=" + value2 + "]";
	}

}

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlueBerries<String, String> obj1 = new BlueBerries<>("Sathish", "test");
		BlueBerries<String, Integer> obj2 = new BlueBerries<>("Johnson", 289);

		System.out.println(obj1 + " \n " + obj2);

	}

}
