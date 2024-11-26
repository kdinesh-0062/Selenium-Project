package Jpractice;

public class Swaping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a + " "+ b);
		// Logic 1 With third variable
		/*
		 * int t;
		 *  t=a; //t=10
		 *   a=b; //20
		 *    b=t; //10
		 * 
		 */		
		
		//Logic 2 Without third variable
		/*a=a+b; // 10+20=30
		b=a-b;  //30-20
		a=a-b;  //30-10*/
		
		
		
		//Login 3 using "*" and "/"
		
		/*a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		// Logic 4 using  "^"
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		
		// Logic 5 Single Statement
		b=a+b-(a=b);
		System.out.println(a+" " +b);
	}

}
