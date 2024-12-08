package thisKeyword;

//By returning this, we are returning the instance of the current object
//which means we can keep on calling other methods of the same class
//Refer the other code: returningThis2

class student {
	int Id;
	String Name;

	public student setId(int Id) {
		this.Id = Id;
		return this;
	}
	
	public student setName(String Name) {
		
		this.Name=Name;
		return this;
		
	}
	
	public void printing()
	{
		System.out.println(Id +"   "+Name);
	}
}

public class returningThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student stud = new student();
		
		stud.setId(20);
		stud.setName("Sathish");
		
		stud.printing();

	}

}
