package FirstSelenium;

public class EveryCharOfFirstWordSecondWay {
	public static void main(String[] args) {
		String name = "i am going to school";
		
		/*
		 * String[] arr = name.split(" "); for (int i = 0; i < arr.length; i++) { char c
		 * = arr[i].charAt(0); // String c1=String.valueOf(c).toUpperCase(); String sub=
		 * arr[i].substring(1);
		 * 
		 * System.out.print((char) (c - 32) + sub + " ");
		 * 
		 * }
		 */
		 	

		String[] np = name.split(" ");
		for(int i=0;i<np.length;i++) {
			
		char nS = np[i].charAt(0);
		String c =String.valueOf(nS).toUpperCase();
		String sub=np[i].substring(1);
		System.out.print(c+sub +" ");
		
		}


	 }}

