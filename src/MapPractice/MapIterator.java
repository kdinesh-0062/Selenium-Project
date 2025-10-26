package MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator {
	public static void main(String[] args) {
		
		//Map<String, Integer> mp=Map.of("A",1,"B",2);
		
		Map<String, Integer> mp=new HashMap<String, Integer>();
		mp.put("A", 1);
		mp.put("B", 2);
		
		
		  for(Map.Entry<String, Integer> entry:mp.entrySet()) {
		  System.out.println(entry.getKey()+ " "+ entry.getValue());
		  
		  mp.putAll(mp);
		  }
		  
		 System.out.println(mp);
		// System.out.println(Entry<K, V>);
	
		/*
		 * for(Object entry:mp.entrySet()) { System.out.print(entry+ " ");
		 * 
		 * }
		 */
		 
		Set<String> keys = mp.keySet();
		Collection<Integer> values = mp.values();
		
		System.out.println(keys);
		System.out.println(values);
		}
}