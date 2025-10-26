package FirstSelenium;

public class ReverseFirstWordOnly {
	public static void main(String[] args) {
		
		String name="Dinesh kumar";
	String[] parts = name.split(" ");
	
	String fname=parts[0];
	String lname =parts[1];
	
	StringBuilder sB=new StringBuilder(fname);
	String test=sB.reverse().toString();
	//String lteString=lname.substring(0,1).toUpperCase()+lname.substring(1).toLowerCase();
	
	//String lastNameString=lname;
	String re = test+" "+lname;
	System.out.println(re);
	
	
	}

}
