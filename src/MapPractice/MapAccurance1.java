package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class MapAccurance1 {
	public static void main(String[] args) {
		
		
		String name="berrybot ,berrybot";
		
		String test = name.toLowerCase().replaceAll("\\s", "");
		
		Map<String, Integer> mp =new HashMap<String, Integer>();
		
		for(String nm:test.split(",")) {
			mp.put(nm, mp.getOrDefault(nm, 0)+1);
		}
		System.out.println(mp);
		
		
		for(Map.Entry<String, Integer> entry: mp.entrySet()) {
			System.out.println(entry.getKey());
		}
		
	}

}
