package StringPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharsWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        char[] input = {'x', 'y', 'x', 'z', 'a', 'y'};

        
        Set<Character> set=new HashSet<Character>(Arrays.asList('x', 'y', 'x', 'z', 'a', 'y'));
		/*
		 * for(char ch:input) { set.add(ch); }
		 */
        System.out.println(set);

	}

}
