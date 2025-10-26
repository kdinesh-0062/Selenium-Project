package FirstSelenium;

import java.util.Scanner;

public class StringPalindrom {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Clean and prepare the string
	        //String cleaned = input.replaceAll("\\s+", "").toLowerCase();

	        // Reverse the string
	        //String reversed = new StringBuilder(cleaned).reverse().toString();
 StringBuilder sBuilder=new StringBuilder(input);
String reversed = sBuilder.reverse().toString();
	        // Check for palindrome
	        if (input.equals(reversed)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a Palindrome");
	        }

	        scanner.close();
	    }
	}


