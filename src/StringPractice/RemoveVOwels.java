package StringPractice;

public class RemoveVOwels {
	public static void main(String[] args) {
		String name="Dinesh";
		String vowel="aeiouAEIOU";
		StringBuilder sBuilder=new StringBuilder();
		
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(vowel.indexOf(ch)==-1) {
            sBuilder.append(ch);
			
			}
		}
		
		System.out.println(sBuilder.toString());
	}

}
