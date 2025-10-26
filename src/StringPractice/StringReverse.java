package StringPractice;

public class StringReverse {

		public static String reverse(String name) {
			
			String rev="";
			
			String actual=rev;
			
			for(int i=0;i<name.length();i++) {
				rev=name.charAt(i)+rev;
			}
			System.out.println(rev);
			return rev;

		}
		
		public static void main(String[] args) {
			String test = StringReverse.reverse("Dinesh");
			
			System.out.println("=========String builder");
			StringBuilder sBuilder=new StringBuilder(test);
			
			System.out.println(sBuilder.reverse());
			
			
			
					}
		
		

}
