package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ClockFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Clock>myList=Arrays.asList(
				
				new Clock("Ajanta",Arrays.asList("EveryDay","Duracell"))
				,new Clock("Quartz",Arrays.asList("DuraKnight","singleCell"))
				);
		
		myList.stream().flatMap(new Function<Clock,Stream<String>>()
				{
			          @Override
			          public Stream<String> apply(Clock obj)
			          {
			        	  List<String>result=new ArrayList<>();
			        	  
			        	  for(String items:obj.getBatteries())
			        	  {
			        		  result.add(items);
			        	  }
			        	  
			        	  return result.stream();
			        	  
			          }
				}
		
				
				
				
				).forEach(System.out::println);	
		
		
		
		//simplify if needed.
		
		System.out.println("\n\n");
		
		//Above implementation is the root one/non-simplified one
		myList.stream().flatMap(obj->obj.getBatteries().stream()).forEach(System.out::println);
		
		
	}

}
