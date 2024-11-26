package FirstSelenium;

public class EveryCharOfFirstWordSecondWay {
	public static void main(String[] args) {
		String name="i am going to school";
		String[] arr = name.split(" ");
		for(int i=0;i<arr.length;i++) {
			char c=arr[i].charAt(0);
			//String c1=String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			
			System.out.print((char)(c-32)+sub+ " ");
			
		}
	}

}
