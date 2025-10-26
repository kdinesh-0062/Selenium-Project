package Jpractice;

public class TestTue {
	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6,2,3};
		for(int i=0;i<a.length;i++) {
			int temp=0;

			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.print(a[j]+ " ");
					temp++;
					break;
				}
			}
		
		
		if(temp>0) {
			break;
			
		}
		
		
	}

}
}