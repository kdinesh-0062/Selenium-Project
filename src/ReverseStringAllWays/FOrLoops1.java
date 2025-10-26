package ReverseStringAllWays;

public class FOrLoops1 {

	public static void main(String[] args) {
		String nameString="Dinesh";
		
		String revString="";
		
		for(int i=0;i<nameString.length();i++) {
			revString=nameString.charAt(i)+revString;
		}
		System.out.println(revString);
	}
}
