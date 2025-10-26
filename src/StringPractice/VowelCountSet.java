package StringPractice;

import java.util.Set;

public class VowelCountSet {
	public static void main(String[] args) {
		String name="Dinesh Kumar Testing Automation";
		
		int count=0;
		          Set<Character> set = Set.of('a','e','i','o','u');
		
		for(char ch:name.toLowerCase().toCharArray()) {
			if(set.contains(ch)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
