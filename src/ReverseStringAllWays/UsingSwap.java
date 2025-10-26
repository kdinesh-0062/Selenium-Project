package ReverseStringAllWays;

public class UsingSwap {
	public static void main(String[] args) {
		String nameString="Dinesh";
		char[] rev=nameString.toCharArray();
		
		int left=0,right=rev.length-1;
		
		while(left<right) {
			char temp=rev[left];
			rev[left]=rev[right];
			rev[right]=temp;
			left++;
			right--;
			
			
		}
		
		System.out.println(rev);
		System.out.println("test :"+ new String(rev));
	}

}
