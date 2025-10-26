package BubbleSor;

public class SortAndRemoveDuplicate {
	public static void main(String[] args) {
    	int[] a = {2, 6, 3, 5, 6, 4, 9, 6, 4, 8, 1};

    	//int temp=0;
		/*
		 * for(int i=0;i<a.length-1;i++) { for(int j=i+1;j<a.length;j++) { if(a[i]<a[j])
		 * { int temp=a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * } }
		 * 
		 * }
		 * 
		 * System.out.print(a[0]); //for(int num:a) { for(int i=1;i<a.length;i++) {
		 * if(a[i]!=a[i-1]) { System.out.print("," +a[i]); } }
		 */
    	
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println(a[0]);
	//for(int num:a) {
		
		  for(int i=1;i<a.length;i++) {
			  if(a[i]!=a[i-1]) {
                System.out.println(a[i]);
		  
		  }
		 
		
		//System.out.print(num+" ");
	}
	
	
	}}
