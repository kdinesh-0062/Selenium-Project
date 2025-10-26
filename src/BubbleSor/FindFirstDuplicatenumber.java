package BubbleSor;

public class FindFirstDuplicatenumber {
	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6,7,7,7,7,7,2};
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.print("First Duplicate element is : " + a[i]);
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


