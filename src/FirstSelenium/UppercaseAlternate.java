package FirstSelenium;

import java.util.Scanner;

import org.checkerframework.common.reflection.qual.NewInstance;

public class UppercaseAlternate {
	   public static void main(String[] args) {      
			/*
			 * Scanner sc=new Scanner(System.in); System.out.println("Enter the name :");
			 * String txt = sc.nextLine(); //String name= txt.toLowerCase(); char[] str =
			 * txt.toCharArray();
			 * 
			 * for(int i=0;i<str.length;i=i+2) { str[i]= Character.toUpperCase(str[i]); }
			 * System.out.println(new String(str));
			 */
		   
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the name: ");
		   
	 String name= sc.nextLine();
	char[] name1=name.toLowerCase().toCharArray();
	
	for(int i=0;i<name1.length;i=i+2) {
		name1[i]=Character.toUpperCase(name1[i]);
		
		
	}
	System.out.println(new String(name1));
	System.out.println(name1);

	
	   
	   } 
	}