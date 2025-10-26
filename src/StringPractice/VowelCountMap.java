package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class VowelCountMap {
	public static void main(String[] args) {
		
		String name="aeiouutrtuoioipppopuiuoieraee";
		Map<Character, Integer> vmap=new HashMap<Character, Integer>();
		for(char ch:name.toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) {
			vmap.put(ch, vmap.getOrDefault(ch, 0)+1);
		}
		
	
		
	}
		System.out.println(vmap);

}
}