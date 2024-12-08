package thisKeyword;

class studentOne {
	String Name;

	studentOne(String Name) {
		this.Name = Name;
	}

	public void printingAnotherStudent(studentTwo studTwo) {
		System.out.println("current class student name: " + this);
		System.out.println("another class student name: " + studTwo);
	}

	@Override
	public String toString() {
		return this.Name;
	}

}

class studentTwo {

	String Name;

	public studentTwo(String Name) {

		this.Name = Name;
	}

	@Override
	public String toString() {
		return this.Name;
	}

}

public class passingThisToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentOne sOne = new studentOne("sathish");

		studentTwo sTwo = new studentTwo("Ravi");
		
		//passing 'this' as an argument(sTwo)
		sOne.printingAnotherStudent(sTwo);

	}

}
