package Trickies;

public class AddNewTest {

public static void main(String[] args) {
		String str = "ABCXYZ";
	int middle = str.length() / 2;
	String firstHalf = str.substring(0, middle);
	String secondHalf = str.substring(middle);
	String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
	String result = reversedSecondHalf + firstHalf;
	System.out.println("Output: " + result);
	System.out.println("Output2: " + result);

}

}
