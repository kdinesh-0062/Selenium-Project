package BubbleSor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.devtools.v120.debugger.Debugger.SetBreakpointByUrlResponse;

public class FIndCommonInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //First method int[] a= {2,3,4,5,6}; int[] b= {7,8,9,6,3};
		 * 
		 * Set<Integer> set=new HashSet<Integer>(); for(int i=0;i<a.length;i++) {
		 * for(int j=0;j<b.length;j++) { if(a[i]==b[j]){ set.add(a[i]);
		 * 
		 * } } } System.out.println(set);
		 */
		
		
		/*
		 * // when we have morethan one duplicate number in same array int[] a=
		 * {2,3,4,5,6,3,3,3,3,3,3,3,3}; int[] b= {7,8,9,6,3,3,3,3,3,3}; Set<Integer>
		 * set=new HashSet<Integer>(); Set<Integer> set1=new HashSet<Integer>(); for(int
		 * num:a) { set.add(num); }
		 * 
		 * for(int num:b) { set1.add(num);
		 * 
		 * } for(int num:set1) { boolean c= set.add(num); if(c==false)
		 * System.out.println(num); }
		 */
		
		
		
		int[] a= {2,3,4,5,6,3,3,3,3,3,3,3,3};
		int[] b= {7,8,9,6,3,3,3,3,3,3};
		
		Set<Integer> setA=new HashSet<Integer>();
		Set<Integer> setB=new HashSet<Integer>();

		//Set<Integer> set=new HashSet<Integer>();
		for(int num:a) {
			setA.add(num);
			//set.add(num);
			
		}
		
		for(int num:b) {
			if(setA.contains(num)) {
			setB.add(num);
			//set.add(num);
			}
		}
		
	System.out.print(setB);
		
		
}
}


