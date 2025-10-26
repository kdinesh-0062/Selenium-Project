package StringPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCountRegex {
	public static void main(String[] args) {
		
		String name="aseropiijlkoppouu";
		int count=0;
		Matcher matcher=Pattern.compile("[aeiouAEOU]").matcher(name);

	while(matcher.find()) {
		count++;
	}
	System.out.println(count);
	}

}
