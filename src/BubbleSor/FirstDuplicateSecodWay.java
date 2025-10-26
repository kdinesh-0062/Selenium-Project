package BubbleSor;

import java.util.HashSet;

public class FirstDuplicateSecodWay {
	public static void main(String[] args) {
		int[] a= {2,4,5,6,7,8,9,9,9,9,0,8,5};
		int temp=0;
		HashSet<Integer> hSet=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(hSet.contains(a[i])) {
				temp=i;
			}
			else {
				hSet.add(a[i]);
			}
			if(temp!=0) {
				System.out.println("Fist Element is :" +a[temp]);
				break;
				
			}
		}
	}

}
