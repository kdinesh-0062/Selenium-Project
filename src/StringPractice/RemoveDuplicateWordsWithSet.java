package StringPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWordsWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] words = {"api", "bdd", "testng", "api", "java"};

        Set<String> set= new HashSet<String>(Arrays.asList(words));
        System.out.println(set);
        
        

	}

}
