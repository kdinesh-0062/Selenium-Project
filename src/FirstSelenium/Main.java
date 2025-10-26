package FirstSelenium;

public class Main{
	public static void main(String[] args) {
		
		int[] a= {10,20,10,15,5,15};
		
		int output=30;
		
		System.out.println("== Pairs that sum to 30 ==");
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == output) {
                    System.out.println(a[i] + " + " + a[j] + " = " + output);
                }
            }
        }

        System.out.println("\n== Triplets that sum to 30 ==");
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
            	int temp=0;
            	boolean isDup=false;
                for (int k = j + 1; k < a.length-1; k++) {
                    if (a[i] + a[j] + a[k] == output) {
                        System.out.println(a[i] + " + " + a[j] + " + " + a[k] + " = " + output);
                       temp++;
                        isDup=true;
                        break;
                    }
                }
            }
            
        }
	
}}