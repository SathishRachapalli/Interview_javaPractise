package practise_sept29;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


//failFastIterators, if we try to modify(add/remove the data) the collection while iterating
//throws ConcurrentModificationException

// To avoid this, we can use myIter.remove() safely in the case of removal operations.
//and using the concurrent or fail-safe iterator supported collections such as
//ConcurrentHashMap, CopyOnWriteArrayList e.t.c,


public class failFast {

	public static void main(String[] args) {
		
		ArrayList<String>myList=new ArrayList<>();
		
		myList.add("sathish");
		myList.add("lokesh");
		myList.add("rakesh");
		
		Iterator<String> myIter=myList.iterator();
		
		
		while(myIter.hasNext())
		{
			if(myIter.next().equals("lokesh"))
			{
		     	myList.add("Ravi");
				
			}
		}
		
		System.out.println(myList);
		
	
		
		
		
		

	}

}
