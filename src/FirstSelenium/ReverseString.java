package FirstSelenium;

public class ReverseString {

	public static void main(String[] args) {
		String name="Dinesh1234";
		int len = name.length();
		/*
		 * for(int i=len-1;i>=0;i--) {
		 * 
		 * System.out.print(name.charAt(i)); }
		 */

		//**********************
		 String revString="";

		for(int i=0;i<len;i++) {
			revString=name.charAt(i)+ revString;

		}
		System.out.println(revString);

	}
	

}

