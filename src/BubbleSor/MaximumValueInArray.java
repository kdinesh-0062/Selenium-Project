package BubbleSor;

public class MaximumValueInArray {
	public static void main(String[] args) {
		int[] a= {2,3,6,8,9,1,12,5,45,7};
		int Max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(Max<a[i]) {
				Max=a[i];
			}
			
		}
		System.out.println(Max);
	}
}
