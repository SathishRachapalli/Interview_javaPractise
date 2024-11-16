package methodReference;

import java.util.function.BiFunction;
import java.util.function.Supplier;

class studentOne
{
	int Id;
	String Name;
	public studentOne(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public studentOne() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "student [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
}

public class referenceToConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supplier<studentOne> mysupplier=()->{return new studentOne();};
		studentOne studObj = mysupplier.get();
		//System.out.println(studObj);
		
		// by using method reference
		
		Supplier<studentOne> mySupplierOne=studentOne::new;
		
		System.out.println(mySupplierOne.get());

		
		// parameterizedconstructor calling.
		
		
		BiFunction<Integer,String,student> myBiFunc=student::new;
		student studObjOne = myBiFunc.apply(12, "sathish");
		System.out.println(studObjOne);
		
		
	}

}
