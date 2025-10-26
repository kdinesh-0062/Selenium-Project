package FirstSelenium;

import java.util.Arrays;

	
	public class LexicographicalSort {
	    public static void main(String[] args) {
	        String[] input = {"a1", "a2", "b1", "b2", "c2", "c1", "d1"};
	        
	       Arrays.sort(input); // Default string sort

	        System.out.println(Arrays.toString(input));
	        
	        
	        for(String test:input) {
	        	
	        	System.out.print(test+ " ");
	        	System.out.println();
	        }
	        
	        
	        for(int i=0;i<input.length;i++) {
	        	String temp;
	        	for(int j=0;j<input.length-1;j++) {
	        		
	        		if(input[j].compareTo(input[j+1])>0) {
	        			
	        			temp=input[j];
	        			input[j]=input[j+1];
	        			input[j+1]=temp;
	        			
	        		}
	        	}
	        }
	        
for(String test:input) {
	System.out.print( test + " ");}
}

}
