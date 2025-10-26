package BubbleSor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSorting {
	public static void main(String[] args) {
		// toSort the number and print in desc number
		
		/*
		 * Integer[] a= {36,29,12,5,19};
		 * 
		 * Arrays.sort(a,Collections.reverseOrder());
		 * 
		 * System.out.println(Arrays.toString(a));
		 * 
		 */
		
		String [] name= {"dinesh","Dinesh","Sujeet","rakesh","chandan","Sonu"};
		
				String temp;
				
				for(int i=0;i<name.length;i++) {
					for(int j=0;j<name.length-1-i;j++) {
						if(name[j].compareTo(name[+1])>0) {
							temp=name[j];
							name[j]=name[j+1];
							name[j+1]=temp;
							
						}
					}
				}
				
				ArrayList<String> list= new ArrayList<String>();
	
				
				for(String nm:name) {
					//list.add(nm);
					System.out.print(nm+ " ");
			
		
		//System.out.println(list);
		
	}
	}
}
