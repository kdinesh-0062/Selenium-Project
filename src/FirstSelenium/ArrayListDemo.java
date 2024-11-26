package FirstSelenium;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			arr.add(i);
			//System.out.println(i);
		
		}
		System.out.println(arr);	
		arr.remove(4);
		System.out.println(arr);
			
		
		

		}}
