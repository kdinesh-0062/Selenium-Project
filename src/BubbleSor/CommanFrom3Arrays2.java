package BubbleSor;

import java.util.ArrayList;

public class CommanFrom3Arrays2 {
	
	public static void main(String[] args) {
		int[] a= {2,3,4,7};
		int[] b= {2,4,6,7};
		int[] c= {2,7,8};
		
		/*
		 * int x=0,y=0,z=0; ArrayList<Integer> al=new ArrayList<>(); while(x<a.length &&
		 * y<b.length && z<c.length) { if(a[x]==b[y] && b[y]==c[z]) { al.add(a[x]); x++;
		 * y++; z++; } else if (a[x]<b[y]) { x++;
		 * 
		 * } else if (b[y]<c[z]) { y++;
		 * 
		 * } else { z++;
		 * 
		 * }
		 * 
		 * 
		 * } for(int no:al) { System.out.print(no);
		 * 
		 * }

		 *
		 */
		
		int x=0,y=0,z=0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(x<a.length&&y<b.length&&z<c.length) {
			if(a[x]==b[y] && b[y]==c[z]) {
				al.add(a[x]);
				x++;
				y++;
				z++;
				
				
			}
			
			else if (a[x]<b[y]) {
				x++;
				
			}
			else if(b[y]<c[z]) {
				y++;
			}
			else {
				z++;
			}
		}
		
		for(int no:al) {
			System.out.print(no + " ");
		}
}
}

