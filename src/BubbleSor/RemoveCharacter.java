package BubbleSor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveCharacter {
    public static void main(String[] args) {
    	String name="Programing";
    	Set<Character> hSet=new LinkedHashSet<Character>();
    	for( char s:name.toCharArray()) {
    		hSet.add(s);
    		//String newtest=hSet.toString();
    		//System.out.println(newtest);
    		
    	}
    	System.out.println(hSet);
		/*
		 * StringBuilder sBuilder=new StringBuilder(); for(char c:hSet) {
		 * sBuilder.append(c);
		 * 
		 * } System.out.println(sBuilder);
		 */
    	
    }
}
