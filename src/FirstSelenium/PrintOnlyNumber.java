package FirstSelenium;

public class PrintOnlyNumber {
public static void main(String[] args) {
	String n="abc12@$3";
	//char c;
	/*
	 * for(int i=0;i<n.length();i++) { char c = n.charAt(i); if(c>='0' && c<='9') {
	 * System.out.print(c); } }
	 */
	
	
	for(int i=0;i<n.length();i++){
		
		char c=n.charAt(i);
		if(c>='0' && c<='9') {
			System.out.println(c);
		}
		
	}
}

}
