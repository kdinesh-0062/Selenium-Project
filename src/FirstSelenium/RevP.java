package FirstSelenium;

public class RevP {
	public static void main(String[] args) {
		String name= "Dinesh1234";
		String digit="";
		String letter="";
		
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(Character.isDigit(c)){
				digit=c+digit;//  4321Dinesh
				//digit+=c;  //1234Dinesh
				
			}
				else {
					letter+=c;
			}
		}
		System.out.println(digit+letter);
		//System.out.println(letter+digit); //output Dinesh4321
		
	}

}
