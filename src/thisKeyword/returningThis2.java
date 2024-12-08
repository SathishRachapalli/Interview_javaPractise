package thisKeyword;

// As discussed in returningThis code , 'returning this' can be used to chain the methods
//Therefore, we can keep on calling any number of methods, that are 'returning this' as their return type.

class counter {
	private int count=0;

	public counter incrementing() {
		count++;
		return this;
	}

	public counter decrementing() {
		count--;
		return this;
	}

	public void doPrint() {
		System.out.println("value of count: " + count);
	}

}

public class returningThis2 {
	
	public static void main(String[] args) {
		
		counter counterObj = new counter();
		
		counterObj.decrementing().incrementing().doPrint();
		
		// This pattern is called as 'builder pattern'
		//we might have seen in many places, where this was implemented.
		
	}

}
