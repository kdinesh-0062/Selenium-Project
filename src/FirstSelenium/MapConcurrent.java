package FirstSelenium;

import java.util.HashMap;
import java.util.Map;

public class MapConcurrent {
	
	public static void main(String[] args) {
		String nameString="Banana apple";
	String	name=nameString.toLowerCase().replaceAll("\\s", "");
	
Map<Character, Integer> mp=new HashMap<Character, Integer>();

for(char ch:name.toCharArray()) {
mp.put(ch, mp.getOrDefault(ch, 0)+1);	
}
System.out.println(mp);
	}

}
