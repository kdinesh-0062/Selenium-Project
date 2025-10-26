package ReverseStringAllWays;

public class ForLoop {
	public static void main(String[] args) {
		String name="Dinesh";
		
		String revString="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			revString+=name.charAt(i);
		}
		
		System.out.println(revString);
	}

}
