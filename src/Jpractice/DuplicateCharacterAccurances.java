package Jpractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterAccurances {
	public static void main(String[] args) {
		
		String name ="Preparation Preparation Testing academic";
		
		name=name.replaceAll("\\s", "");
		char[] n1 = name.toLowerCase().toCharArray();
		
		for(int i=0;i<n1.length;i++) {
			for(int j=i+1;j<n1.length;j++) {
				if(n1[i]==n1[j]) {
					//System.out.println(n1[i]);
					
				}
			}
		}
			Map<Character, Integer> mp=new HashMap<Character, Integer>();
			
			
			for(char ch:n1) {
				if(mp.containsKey(ch)) {
					mp.put(ch, mp.get(ch)+1);
				}
				else {
					mp.put(ch, 1);
						
				}
			}
				System.out.println(mp);
					}
				}
				
			
	

