package FirstSelenium;


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
		
		String[] arr = name.split(" ");
		for(int i=0;i<arr.length;i++) {
			char c = arr[i].charAt(0);
			String c1 = String.valueOf(c).toUpperCase();
			String sb = arr[i].substring(1);
			System.out.print(c1+sb+ " ");
		
			
		}
	}

}
