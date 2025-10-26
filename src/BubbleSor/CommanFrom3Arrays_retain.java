package BubbleSor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommanFrom3Arrays_retain {
	
	public static void main(String[] args) {
		Integer[] a= {2,3,4,7}; // to pass as argument converted  Integer from int
		Integer[] b= {2,4,6,7};
		Integer[] c= {2,7,8};
		
		
		List<Integer> l1=Arrays.asList(a);
		List<Integer> l2=Arrays.asList(b);
		List<Integer> l3=Arrays.asList(c);
		
		
		List<Integer> temp=new ArrayList<Integer>(l1);
		temp.retainAll(l2);
		temp.retainAll(l3);
		
		System.out.println(temp);
		
		}
		
	}


