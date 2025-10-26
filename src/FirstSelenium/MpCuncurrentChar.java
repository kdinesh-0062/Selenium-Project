package FirstSelenium;

import java.util.HashMap;
import java.util.Map;

public class MpCuncurrentChar {
	public static void main(String[] args) {
		String name = "This is AutomationAutomation";

		String name1=name.toLowerCase().replaceAll("\\s", "");
		char[] ch=name1.toCharArray();
		
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		for(char c:ch) {
			//if(mp.containsKey(c)) {
				//mp.put(c, mp.get(c)+1);
			//}
			//else {
				//mp.put(c, 1);
			mp.put(c, mp.getOrDefault(c,0)+1);
			
			}
			
		
		
		System.out.println(mp);
		}

}
