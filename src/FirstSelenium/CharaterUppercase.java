package FirstSelenium;
public class CharaterUppercase {
    public static void main(String[] args) {
        String input = "Hello world"; // example string in lowercase
 //input=input.toLowerCase();
        // Check if the string is in lowercase, then convert to uppercase
        if (input.equals(input)) {
            input = input.toUpperCase(); // Convert to uppercase
        }

        System.out.println(input); // Output will be in uppercase
    }
}
