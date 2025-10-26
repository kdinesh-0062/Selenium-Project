package Jpractice;

public class EveryFirstWordInCap {
	
	public static void main(String[] args) {
		
		String nameString ="my name is dinesh kumar sdada adada dweff ergefv drgfg fdgdfg dfdr";
		
		
		 String[] name = nameString.split(" ");
		 
		 for(int i=0;i<name.length;i++) {
			 
			 char ch = name[i].charAt(0);
		String	s1= String.valueOf(ch).toUpperCase();
		String s2= name[i].substring(1);
		
		System.out.print(s1+s2 + " ");
		
			 
			 
			 
		 }
	}

}
