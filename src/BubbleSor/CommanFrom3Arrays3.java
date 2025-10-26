package BubbleSor;

import java.util.HashSet;
import java.util.Set;

public class CommanFrom3Arrays3 {
	
	public static void main(String[] args) {
		int[] a= {2,3,4,7};
		int[] b= {2,4,6,7};
		int[] c= {2,7,8};
		
		
		Set<Integer> se1=new HashSet<Integer>();
		Set<Integer> se2=new HashSet<Integer>();
		Set<Integer> result =new HashSet<Integer>();
		
		for(int num:a) {
			se1.add(num);
		}
		for(int num:b) {
			if(se1.contains(num)) {
				se2.add(num);
			}
		}
		for(int num:c) {
			if(se2.contains(num)) {
				result.add(num);
			}
		}
		System.out.println(result);
		}
		
	}


