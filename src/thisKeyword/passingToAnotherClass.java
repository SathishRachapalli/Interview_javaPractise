package thisKeyword;

class Car {
	String model;

	Car(String model) {
		this.model = model;
		new CarDetails(this);
		// in the above line, we passed the current class instance(and its data) to
		// another class - CarDetails by using 'this'
	}

	public String getModel() {
		return model;
	}

}

class CarDetails {
	public CarDetails(Car carObj) {
		System.out.println(carObj.getModel());
	}
}

public class passingToAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car carObj = new Car("BMW");

		// System.out.println(carObj.getModel());

	}

}
