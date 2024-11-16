package practise_sept26;

import java.util.Comparator;
import java.util.Map;

public class mapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String>myMap=Map.of(
				1,"sathsih",45,"rachana",41,"rishi"
				
				);
		
		
	//	myMap.entrySet().forEach(c->System.out.println(c.getKey()+"  "+c.getValue()));
		
		//comparingby value
		
		
	//	myMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(c->System.out.println(c.getKey()+"  "+c.getValue()));

	}

}
