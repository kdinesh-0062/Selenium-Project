package StringPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
	 public static void main(String[] args) {
	        String input = "Software Services";
	        input = input.replaceAll(" ", "").toLowerCase();
	        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
	        for (char ch : input.toCharArray())
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue()==1) {
	                System.out.println("First Non-Repeated Character: " + entry.getKey());
	                break;
	            }
	        }
	    }

}
