package FirstSelenium;

public class ReverseHalfChar {
	public static void main(String[] args) {
		String name= "ABCDEFDH";
		 int mid = name.length()/2;
		 
		 String first = name.substring(0,mid);
		 String last =name.substring(mid);
		 
		 StringBuilder sBuilder=new StringBuilder(first);
		 String rev = sBuilder.reverse().toString();
		 System.out.println(rev+last);
		 
		
	
	}

}
