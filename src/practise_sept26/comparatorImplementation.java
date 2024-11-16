package practise_sept26;



interface comparator
{
	int comparing(String s1, String s2);
}

public class comparatorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		comparator obj=(s1,s2)->{return s1.compareTo(s2);};
		
		int result=obj.comparing("sathish", "john");
		
		System.out.println(result);
	

	}

}
