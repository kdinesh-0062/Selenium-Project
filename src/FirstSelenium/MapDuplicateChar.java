package FirstSelenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.checkerframework.checker.units.qual.Length;
import org.checkerframework.checker.units.qual.m;

public class MapDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String str = "Selenium"; char[] ch = str.toCharArray();
		 * System.out.println(ch);
		 * 
		 * Map<Character, Integer> mp = new HashMap<Character, Integer>(); //
		 * System.out.println(mp);
		 * 
		 * for (char c : ch) { if (mp.containsKey(c)) { mp.put(c, mp.get(c) + 1); }
		 * 
		 * else { mp.put(c, 1); } } System.out.println(mp);
		 */ /*
			 * Set<Entry<Character, Integer>> en = mp.entrySet(); for (Entry<Character,
			 * Integer> e : en) { if (e.getValue() > 1) { System.out.println(e.getKey() + ""
			 * + e.getValue()); } }
			 */

		String name = "This is Automation interview";
		String name1=name.replaceAll("\\s", "");
		//char[] ch = name1.toLowerCase().toCharArray();
		//System.out.println(ch);

		/*
		 * Map<Character,Integer> mp=new HashMap<Character, Integer>(); for(char c:ch) {
		 * if(mp.containsKey(c)) { mp.put(c, mp.get(c)+1);
		 * 
		 * 
		 * } else { mp.put(c, 1);
		 * 
		 * 
		 * } }
		 */
		// System.out.println(mp);
		/*
		 * for (int i = 0; i < ch.length; i++) { for (int j = i + 1; j < ch.length; j++)
		 * { if (ch[i] == ch[j]) { //System.out.print(ch[i]); }
		 * 
		 * } }
		 */

		
		  Map<Character, Integer> mp = new HashMap<Character, Integer>();
		  for (char c :name1.toCharArray())
		  { if (mp.containsKey(c))
		  {
			  mp.put(c, mp.get(c) + 1); }
		  else { mp.put(c,1); }
		  
		  }
		  
		  System.out.println(mp);
		 
	}
}
