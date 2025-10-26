package FirstSelenium;

public class SpiltCharAndReverse {
    public static void main(String[] args) {
        // Input string
        String str = "ABCXYZ";
        
        // Find the middle index
        int middle = str.length() / 2;
        
        // Split into two halves
        String firstHalf = str.substring(0, middle); // "ABC"
        String secondHalf = str.substring(middle);   // "XYZ"
        
        // Reverse the second half
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString(); // "ZYX"
        
        // Concatenate reversed second half with first half
        String result = reversedSecondHalf + firstHalf; // "ZYXABC"
        
        // Print the result
        System.out.println("Output: " + result);
    }
}