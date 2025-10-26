package BubbleSor;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {
	public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 9, 1, 5};

        Set<Integer> set=new HashSet<Integer>();
        
        for(int num:arr) {
        	
        	set.add(num);
        }
        
        System.out.println(set);
	}

}



