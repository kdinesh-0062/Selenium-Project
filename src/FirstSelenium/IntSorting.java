package FirstSelenium;

public class IntSorting {
	public static void main(String[] args) {
		
		
		int[] a= {20,19,22,35,65,76,3,2,45,1};
		
		int temp;
		
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
		}
		
		//System.out.println(a[1]);
		System.out.println("=================");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
