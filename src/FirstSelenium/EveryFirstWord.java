package FirstSelenium;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class EveryFirstWord {
	public static void main(String[] args) {
		String name="i am going to school";
		/*
		 * String[] arr = name.split(" "); for(int i=0;i<arr.length;i++) { char
		 * c=arr[i].charAt(0); String c1=String.valueOf(c).toUpperCase(); String
		 * sb=arr[i].substring(1); System.out.print(c1+sb +" ");
		 * 
		 * }
		 * 
		 * 
		 */	
		
		/*
		 * String[] arr = name.split(" "); for(int i=0;i<arr.length;i++) { char c =
		 * arr[i].charAt(0); String c1 = String.valueOf(c).toUpperCase(); String sb =
		 * arr[i].substring(1); System.out.print(c1+sb+ " ");
		 * 
		 * 
		 * }
		 */	
		
		/*
		 * StringBuffer sB= new StringBuffer();
		 * 
		 * String[] nm = name.split( " ");
		 * 
		 * for(String ch:nm) { if(!ch.isEmpty()) {
		 * sB.append(Character.toUpperCase(ch.charAt(0)))
		 * .append(ch.substring(1)).append(" ");
		 * 
		 * 
		 * } }
		 * 
		 * System.out.println(sB.toString().trim());
		 */
		
		
		StringBuffer sB=new StringBuffer();
		
		String[] nm = name.split(" ");
		
		for( String ch:nm) {
			if(!ch.isEmpty()) {
				
				sB.append(Character.toUpperCase(ch.charAt(0))).append(ch.substring(1)).append(" ");
			}
		}
		System.out.println(sB.toString().trim());
	}
}
