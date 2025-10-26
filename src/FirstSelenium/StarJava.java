package FirstSelenium;

import java.util.Arrays;

public class StarJava {
	
	  public static void main(String[] args) {
	  System.out.println(Arrays.toString(reverse("grey fox jumps over dog"))); }
	  
	  public static String[] reverse(String input) 
	  { String[] words =
	  input.split("\\s+"); 
	  String[] reversed = new String[words.length];
	  
	  for (int i = 0; i < words.length; i++) {
		  reversed[words.length - i - 1] =words[i]; }
	  return reversed; }
	  
	 
	

	
}