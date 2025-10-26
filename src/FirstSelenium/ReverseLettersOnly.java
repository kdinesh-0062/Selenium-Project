package FirstSelenium;

public class ReverseLettersOnly {
	public static void main(String[] args) {
		String name = "Dinesh1234";
		String digit = "";
		String letter = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isLetter(ch)) {
				letter = ch + letter;
			} else if (Character.isDigit(ch)) {
				digit = ch+digit;
			}
		}
		System.out.println(letter + digit);  //hseniD1234

	}
}
