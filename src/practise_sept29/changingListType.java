package practise_sept29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// throws java.lang.UnsupportedOperationException
// due to the unmodifiable collection used here like lineNo:16


public class changingListType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = Arrays.asList("sathish","lokesh","rakesh");


		Iterator<String> myIter = myList.iterator();

		while (myIter.hasNext()) {
			if (myIter.next().equals("lokesh")) {
				myList.add("Ravi");
			}
		}

		System.out.println(myList);

	}

}
