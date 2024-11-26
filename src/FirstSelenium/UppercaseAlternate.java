package FirstSelenium;

import java.util.Scanner;

public class UppercaseAlternate {
	   public static void main(String[] args) {      
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the name :");
	      String txt = sc.nextLine();
	    //String  name=  txt.toLowerCase();
	      char[] str = txt.toCharArray();
	      
	      for(int i=0;i<str.length;i=i+2) {
	    	 str[i]= Character.toUpperCase(str[i]);
	      }
	      System.out.println(new String(str));
	   } 
	}