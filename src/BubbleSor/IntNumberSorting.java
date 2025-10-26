package BubbleSor;

import java.util.ArrayList;
import java.util.Arrays;

public class IntNumberSorting {
	public static void main(String[] args) {

		int[] a = { 36, 19, 29, 12,5};
		// Direct by using Arrays Method

		/*
		 * Arrays.sort(a); System.out.println(Arrays.toString(a));
		 */

		// 2nd ways using FoorLoop

		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length-1; j++) {

				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(a[0]);
		ArrayList<Integer> list=new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			
			System.out.print(a[i] + " ");
		}
		
		
		//System.out.println(list);

		// 3rd way
		/*
		 * int temp;
		 * 
		 * for(int i=0;i<a.length-1;i++) { for(int j=i+1;j<a.length;j++) { if(a[i]>a[j])
		 * { temp=a[i]; a[i]=a[j]; a[j]=temp; } } } for(int value:a) {
		 * System.out.print(value+ " "); }
		 */

	}

}
