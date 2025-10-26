package FirstSelenium;
public class ReversePattern {
    public static void main(String[] args) {
        String name = "Dinesh1234";

        String letters = "";
        String digits = "";

        // Separate letters and digits
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isDigit(ch)) {
                digits += ch;
            } else if (Character.isLetter(ch)) {
                letters += ch;
            }
        }

        // Reverse digits
        String reversedDigits = "";
        for (int i = digits.length() - 1; i >= 0; i--) {
            reversedDigits += digits.charAt(i);
        }

        // Print outputs
        System.out.println(digits + letters);        // 1234Dinesh
        System.out.println(reversedDigits + letters); // 4321Dinesh
        System.out.println(letters + reversedDigits); // Dinesh4321
    }
}


// for output 1234Dinesh
/*
 * public class ReverseDigitsLetters { public static void main(String[] args) {
 * String name = "Dinesh1234";
 * 
 * String digits = ""; String letters = "";
 * 
 * // Separate digits and letters for (int i = 0; i < name.length(); i++) { char
 * ch = name.charAt(i); if (Character.isDigit(ch)) { digits += ch; } else if
 * (Character.isLetter(ch)) { letters += ch; } }
 * 
 * // Combine: digits first, then letters System.out.println(digits + letters);
 * } }
 */



// for output 4321Dinesh

//public class ReverseDigitsOnly {
  /*  public static void main(String[] args) {
        String name = "Dinesh1234";

        String digits = "";
        String letters = "";

        // Separate digits and letters
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isDigit(ch)) {
                digits += ch;
            } else if (Character.isLetter(ch)) {
                letters += ch;
            }
        }

        // Reverse digits
        String reversedDigits = "";
        for (int i = digits.length() - 1; i >= 0; i--) {
            reversedDigits += digits.charAt(i);
        }

        // Combine reversed digits + original letters
        System.out.println(reversedDigits + letters);
    }
}*/



// Output Dinesh4321

	/*
	 * public class ReverseDigitsAtEnd { public static void main(String[] args) {
	 * String name = "Dinesh1234";
	 * 
	 * String letters = ""; String digits = "";
	 * 
	 * // Separate letters and digits for (int i = 0; i < name.length(); i++) { char
	 * ch = name.charAt(i); if (Character.isLetter(ch)) { letters += ch; } else if
	 * (Character.isDigit(ch)) { digits += ch; } }
	 * 
	 * // Reverse the digits String reversedDigits = ""; for (int i =
	 * digits.length() - 1; i >= 0; i--) { reversedDigits += digits.charAt(i); }
	 * 
	 * // Combine: letters first, then reversed digits System.out.println(letters +
	 * reversedDigits); } }
	 */



