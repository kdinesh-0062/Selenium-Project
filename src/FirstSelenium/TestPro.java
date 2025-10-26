package FirstSelenium;

public class TestPro {
	public static void main(String[] args) {
		
		
		
		String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            try {
                int num = Integer.parseInt(token);
                if ((num > 0 && num != 4 && num != 5 && num != 9) || (num < 0 && num >= -3)) {
                    System.out.print(num + " ");
                }
            } catch (NumberFormatException e) {
                // Ignore non-integers
            }
        }
	
	}}


//input 1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1

//output 1 2 3 6 7 8 -3 -2 -1
 