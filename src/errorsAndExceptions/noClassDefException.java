package errorsAndExceptions;

// right click-> show in -> system explorer
//Now delete the .class files and now run this code, we will get noClassDefFoundError

//to resolve it, click on the project->clean.
// now try to rerun the code.
// the .class files will be deleted/cleaned from the source folder 
// and when we reran it, all the files would be re-generated.

class sample

{
	static 
	{
		
		System.out.println("sample class");
	}
	
	void show()
	{
		System.out.println("sample method");
	}
}

public class noClassDefException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample sam=new sample();
		sam.show();
		
	}

}
