package BubbleSor;

public class SingleElementRes {
public static void main(String[] args) {
	int [] a= {2,4,5,6,2,4,5,6,9};
	int res=a[0];
	
	for(int i=1;i<a.length;i++) {
		res=res^a[i];
	}
	System.out.print("Single elemet is :" +res);
}
}
