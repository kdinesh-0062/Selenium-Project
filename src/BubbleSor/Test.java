package BubbleSor;

public class Test {

	public static void main(String[] args) {
		
		
		String s1= new String("Dinesh");
		String s2=new String("Dinesh");
		String s3="Dinesh";
		String s4="Dinesh";
		
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		
		System.out.println("==========");
		
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));

	}
}
