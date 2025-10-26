package FirstSelenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("SE", "Selenium");
		mp.put("JE", "Jenkins");
		mp.put("TN", "TestNG");
		System.out.println(mp);
		
		
		  //Set<Entry<String, String>> Aenty = mp.entrySet();
		  //System.out.println(Aenty);
		  
		Set<Entry<String, String>> entry = mp.entrySet();
		System.out.println(entry);
		
		  
		  for(Entry<String, String> en:entry) {
			  System.out.println(en.getKey());
		  }
			/*
			 * for(Entry<String, String>en:Aenty) { System.out.println(" Key " + en.getKey()
			 * + " value " +en.getValue());
			 * 
			 * }
			 */
		
		}

}
