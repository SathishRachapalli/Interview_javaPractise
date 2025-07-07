package practise;

import java.util.function.Supplier;

class employee {
	int age;
	String name;

	public employee() {
		super();
	}

	public employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class MethodReferencetoaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// employee emp=new employee(); // supplying the employee as input by creating
		// the employee object - emp , input: employee

		// System.out.println(emp); // printing the toString implicitly -- output :
		// string;

		// input - , output- String

		Supplier<employee> mySupplier = new Supplier<>() {

			@Override
			public employee get() {
				// TODO Auto-generated method stub
				return new employee(12, "sathish");
			}

		};
		
		
		
		//simplifying further
		
		
		Supplier<employee> mySupplierOne = employee::new;

		System.out.println(mySupplierOne.get());
		
		

	}

}
