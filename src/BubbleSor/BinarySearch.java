package BubbleSor;

public class BinarySearch {
	public static void main(String[] args) {
		// For Binary search can happen only if array list is already sorted if not then
		// first sort with buuble sort and they try binary search

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,51};

		int value = 6;

		/*
		 * int li = 0; int hi = a.length - 1; int mi = (li + hi) / 2;
		 * 
		 * while (li <= hi) { if (a[mi] == value) { System.out.println("found at index "
		 * + mi); break; }
		 * 
		 * else if (a[mi] < value) { li = mi + 1;
		 * 
		 * } else { hi = mi - 1; } mi = (li + hi) / 2;
		 * 
		 * } if (li > hi) { System.out.println("not found "); }
		 */
		
		
		// Secod way
		boolean test=false;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==value) {
				System.out.println(i);
				test=true;
				break;
			}
		}
		if(!test) {
			System.out.println("not");
		}
	}
}
