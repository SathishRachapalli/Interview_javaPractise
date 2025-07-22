package generics_Concept;

class DragonFruit {
	public void show(String[] array) {
		for (String item : array) {
			System.out.println(item);
		}
	}

	// we can create a generic- method same like above

	public static <T> void showItems(T[] t) {

		for (T item : t) {
			System.out.println(item);
		}

	}

}

public class OneDimensionalGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DragonFruit.showItems(new String[] { "sathish", "John", "Esther" });

		DragonFruit.showItems(new Integer[] { 10, 23, 45 });

	}

}
