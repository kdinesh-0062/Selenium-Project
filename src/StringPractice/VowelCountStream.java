package StringPractice;

public class VowelCountStream {
	public static void main(String[] args) {
		String name="tesdfsdfsdfooiuiuhkjjiiuoioioiuoieaa";
		
	int count=(int)name.toLowerCase()
			.chars()
			.filter(ch->"aeiou".indexOf(ch)!=-1)
			.count();	
	System.out.println(count);
		
	}

}
