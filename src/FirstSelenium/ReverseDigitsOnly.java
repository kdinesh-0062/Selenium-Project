package FirstSelenium;
public class ReverseDigitsOnly {
    public static void main(String[] args) {
        String name = "Dinesh1234";
        String letters = "";
        String reversedDigits = "";

		/*
		 * for (int i = 0; i < name.length(); i++) { char ch = name.charAt(i);
		 * 
		 * if (Character.isDigit(ch)) { reversedDigits = ch + reversedDigits; // reverse
		 * digits } else { letters += ch; // keep letters in original order } }
		 * 
		 * System.out.println(letters + reversedDigits); // Output: Dinesh4321
		 */    
    for(int i=0;i<name.length();i++) {
    	
    	char ch = name.charAt(i);
    	
    	if(Character.isLetter(ch)) {
    		//reversedDigits=ch+reversedDigits;
    		letters+=ch;
    	}
    	else {
			reversedDigits=ch+reversedDigits;
		}
    }
    System.out.println(letters+reversedDigits);
    
    }
}
