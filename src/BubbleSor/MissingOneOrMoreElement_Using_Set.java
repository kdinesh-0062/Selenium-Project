package BubbleSor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class MissingOneOrMoreElement_Using_Set {
	public static void main(String[] args) {
		
	
	
	int[] arr= {1,2,3,4,5,8,10};
	/*
	 * //Using Hashset Set<Integer> se=new HashSet<Integer>(); for(int num:arr) {
	 * se.add(num);
	 * 
	 * }
	 * 
	 * int max=arr.length+1; System.out.println("Missing Number");
	 * 
	 * for(int i=1;i<=max;i++) { if(!se.contains(i)) { System.out.println(i +" "); }
	 * }
	 */
	
	
	/*
	 * Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	 * 
	 * for(int num:arr) { map.put(num,map.getOrDefault(num, 0)+1); }
	 * 
	 * int max = 10; System.out.println("Missing numbers:"); for (int i = 1; i <=
	 * max; i++) { if (!map.containsKey(i)) { System.out.print(i + " "); } }
	 */
	
	/*
	 * HashSet<Integer> set = new HashSet<Integer>();
	 * 
	 * for(int num:arr) {
	 * 
	 * set.add(num); } int max=arr.length+2; System.out.println("missing Number");
	 * for(int i=1;i<=max;i++) { if(!set.contains(i)) { System.out.println(i+" "); }
	 * }
	 */
	int mis=arr.length+2;
    Set<Integer> set = new HashSet<>();
   
   for(int num:arr){
       set.add(num);
   }
   
   for(int i=1;i<=mis;i++){
       if(!set.contains(i)){
           System.out.println(i);
       }
   }
	
}
}










