package FirstSelenium;

public class StringTest {
	public static void main(String[] args) {
		String a="test";
		String b="test";
		
		String c=new String("abc");
		String d=new String("abc");
		
		
		if(c.equals(d)) {
			System.out.println("c is equal to d");
		}
		else {
			System.out.println("c is not equal to d");
		}
		if(a==b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
