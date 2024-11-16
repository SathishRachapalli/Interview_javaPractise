package practise_sept26;

public class sumOfNumbersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="as98sfs";
		
		int result=input.chars().mapToObj(c->(char)c)
		.filter(c->"0123456789".indexOf(c)!=-1)
		.map(Character::getNumericValue).reduce(0,(c,e)->c+e);
	
	//System.out.println(result);
		
		input.chars().mapToObj(c->(char)c)
		.filter(c->"aeiouAEIOU".indexOf(c)==-1)
		.forEach(System.out::println);
	}

}
