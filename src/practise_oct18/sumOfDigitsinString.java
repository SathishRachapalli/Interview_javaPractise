package practise_oct18;

public class sumOfDigitsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="23";
		
		int result=input.chars().mapToObj(c->(char)c)
		.map(Character::getNumericValue).reduce(0,(c,e)->c+e);
		
		System.out.println(result);
		
		
	}

}
