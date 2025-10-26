package FirstSelenium;

import java.util.HashMap;

public class Tr1 {
public static void main(String[] args) {
	
			String name = "This is Automation Interview Testing ";

			String lc = name.toLowerCase();

			HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

			for (char ch : lc.toCharArray()) {
				if (ch == ' ')
					continue;

				if (mp.containsKey(ch)) {
					mp.put(ch, mp.get(ch) + 1);
				} else {
					mp.put(ch, 1);
				}
			}

			for (char ch : mp.keySet()) {
				System.out.print(ch + " : "  + mp.get(ch) +" , ");

			}
		}
	

}

