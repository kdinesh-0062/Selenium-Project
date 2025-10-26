package StringPractice;

public class VowelCount {
	public static void main(String[] args) {
		String input="testing accedemic school pvt ltd applied maths";
		int vowelCount = 0;
		String results = null;
		for(int i =0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o' || ch=='u') {
				vowelCount++;
				results+=ch;
			}
		}
		
		System.out.println("aeiou =" +vowelCount);
		System.out.println("aeiou =" +results);

	}

}