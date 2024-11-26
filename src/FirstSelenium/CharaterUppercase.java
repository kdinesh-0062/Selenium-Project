package FirstSelenium;

public class CharaterUppercase {
	public static void main(String[] args) {
		 String str = "dInesh";
		    String res = "";
			/*
			 * for (int i = 0; i < str.length(); i++) { char ch = str.charAt(i); if
			 * (Character.isUpperCase(ch)) x += Character.toLowerCase(ch); else x +=
			 * Character.toUpperCase(ch); } System.out.println(x);
			 */
		    for(int i=0;i<str.length();i++) {
		    	char ch=str.charAt(i);
		    	if(Character.isUpperCase(ch))
		    		res+=Character.toLowerCase(ch);
		    	else 
		    		res +=Character.toUpperCase(ch);
				}
		    
		    System.out.println(res);
		    }
		    
		    
		    
		  }
		
	


