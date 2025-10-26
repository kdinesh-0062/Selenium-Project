package ReverseStringAllWays;

public class ReversetoArrayList {
	public static void main(String[] args) {
		
	
	String nameString="Dinesh";
	char[] cha = nameString.toCharArray();

	
	for(int i=nameString.length()-1;i>=0;i--) {
		System.out.print(cha[i]);
		
	}
}
}