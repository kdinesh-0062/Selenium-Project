package StringPractice;

public class StringPalindrom {
	public static void main(String[] args) {
		
		String nameString="aba";
		
		StringBuilder sBuilder=new StringBuilder(nameString);
		String rev = sBuilder.reverse().toString();
		
		if(nameString.equals(rev)) {
			System.out.println("palimdrom");
		}
		
		else {
			System.out.println("no");
		}
	}
	

}
