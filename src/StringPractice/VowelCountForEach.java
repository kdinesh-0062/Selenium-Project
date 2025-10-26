package StringPractice;

public class VowelCountForEach {
	public static void main(String[] args) {
		String name = "ancdfd gdfgd  fgsfdp oklsjiow iuerhjbnv";
		int count=0;
		//for(char ch:name.toCharArray())
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if("aeiou".indexOf(ch)!=-1) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
