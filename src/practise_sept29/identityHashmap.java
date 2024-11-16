package practise_sept29;

import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<String,String> myMap=new IdentityHashMap<>();
		
		String key1=new String("key1");
		//String key2=new String("key2");
		
		String key2=key1;
		
		
		myMap.put(key1, "value1");
		myMap.put(key2, "value2");
		
		System.out.println(myMap.size());
		
		System.out.println(myMap);
		

	}

}
