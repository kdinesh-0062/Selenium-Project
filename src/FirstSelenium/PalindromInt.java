package FirstSelenium;

public class PalindromInt {
	public static void main(String[] args) {
		
		
			
			
		int num=1234567890;
		int original=num;
		
		int rem,rev = 0;
		
		while(num!=0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
		
		
		if(original==rev) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
