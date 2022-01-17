import java.util.HashMap;
import java.util.Map;

public class Application {
	public static void main(String[] args)
	{
		Map<Integer,Double>map=new HashMap<>();
        map.put(1, 94.23);
         map.put(5, 5.5);
          map.put(6, 65.5);
	        map.put(3, 39.25);
	        map.put(8, 85.5);
	        map.put(11, 10.95);
	        map.put(23, 67.5);
	        map.put(54, 89.7);
	        map.put(89, 23.8);
	        map.put(73, 11.5);
	    System.out.println("Data in Hashmap:");
	    for(Map.Entry m:map.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    	
	    }
	}
}
