package FirstSelenium;

import java.util.HashSet;
import java.util.Set;

public class ArrayList {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 4, 4, 4, 4, 4, 4, };
		int[] b = { 8, 1, 3, 9, 4, 4, 4, 4 };

		/*
		 * Set<Integer> setA = new HashSet<Integer>();
		 * 
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < b.length; j++)
		 *  { if
		 * (a[i] == b[j]) {
		 * 
		 * setA.add(b[j]); } } }
		 * 
		 * 
		 * System.out.println(setA);
		 */

		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		Set<Integer> dupl = new HashSet<Integer>();

		for (Integer num : a) {
			/*
			 * if (!setA.add(num)) { dupl.add(num); }
			 */
			setA.add(num);
		}

		for (Integer num : b) {
			if (setA.contains(num)) {
				setB.add(num);
			}
		}

		//setA.retainAll(setB);

		System.out.println(setB);

	}
}
