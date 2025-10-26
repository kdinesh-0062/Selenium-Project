package FirstSelenium;

public class RevPatt {
	
	public static void main(String[] args) {
		String name="Dinesh1234";
		String digit=" ";
		String letter="";
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			
			if(Character.isDigit(ch)) {
				digit+=ch;
			}
			else if (Character.isLetter(ch)) {
				letter=ch+letter;
				
			}
		}
		
		String reverseString="";
		for(int i=digit.length()-1;i>=0;i--) {
			reverseString+=digit.charAt(i);
		}
		
		//System.out.println(reverseString+digit);
		System.out.println(digit+letter);
		System.out.println(letter+reverseString);
		
		
	}

}
