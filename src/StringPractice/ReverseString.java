package StringPractice;

public class ReverseString {
	public static void main(String[] args) {
		String name="testing";
		
	String revString="";
	char[] test = name.toCharArray();
	
	for(int i=name.length()-1;i>=0;i--) {
		revString+=test[i];
		
		
	}
	System.out.println(revString);
	}

}
