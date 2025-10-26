package FirstSelenium;

public class ReverseFirstWordOnly2 {
	
	public static void main(String[] args) {
		String name="Dinesh Kumar";
		
	String[] part=name.split(" ");
	String firstName=part[0];
	String secondName=part[1];
	
	/*
	 * String revString="";
	 * 
	 * for(int i=0;i<firstName.length();i++) {
	 * 
	 * revString=firstName.charAt(i)+revString;
	 * 
	 * }
	 * 
	 * System.out.println(revString+ " "+ secondName);
	 */
	
	StringBuffer sBuffer=new StringBuffer(firstName);
	String rev=sBuffer.reverse().toString();
	System.out.println(rev+secondName);
	}

}
