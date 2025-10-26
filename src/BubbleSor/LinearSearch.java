package BubbleSor;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8};
		int t=5;
		boolean flage=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				System.out.print("Found on index :" +i);
				flage =true;
				break;
			}
		}
		if(!flage) {
			System.out.println("Colud not found");
			
		}
	}

}



