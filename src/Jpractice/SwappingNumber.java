package Jpractice;

public class SwappingNumber {
public static void main(String[] args) {
	
	//int t ;
	int a=10;
	int b=20;
	
	/*
	 * t=a; 
	 * // 10 a=b; 
	 * // 20 b=t; 
	 * //10
	 */	
	
	/*
	 * a=a+b; //10=+20 =30 
	 * b=a-b;
	 * a=a-b; 
	 */
	
	
	/*
	 * a=a*b; //10*20=200; b=a/b; //200/20=10; a=a/b; //200/10=20;
	 */	
	
	/*a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a);
	System.out.println(b);
                                           

		
		*/
	
	b=a+b-(a=b);
	System.out.println("b =" +b +" "+  "a=" +a);
	}
		

}