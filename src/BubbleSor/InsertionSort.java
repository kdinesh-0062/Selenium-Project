package BubbleSor;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {87,54,32,5,45,67,87,3,5,6};
		int temp,j;
		
		for(int i=1;i<a.length;i++) {
			
			temp=a[i];
			j=i;
			
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[i]=temp;
		}
		
		for(int i=0;i>a.length;i++) {
			System.out.println(a[i]+ " ");
		}
		
	}

}
