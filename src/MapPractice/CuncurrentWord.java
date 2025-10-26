package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class CuncurrentWord {
	public static void main(String[] args) {
		
		String name="apple,banana,apple,mango";
		
	
	Map<String, Integer> mp= new HashMap<String, Integer>();
	for(String word:name.split(",")) {	
		
		
		mp.put(word, mp.getOrDefault(word, 0)+1);
		
	}
	System.out.println(mp);
	
	
	}

}
