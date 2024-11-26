package FirstSelenium;
public class ThirdLargest {

    public static void main(String[] args) {
        int ar[] = {20, 1, 30, 12, 3, 2, 4, 5, 6};

        // Initialize variables to hold the first, second, and third largest numbers
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Loop through the array to find the largest, second largest, and third largest
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > first) {
                third = second;  // Update third to be second
                second = first;  // Update second to be first
                first = ar[i];   // Update first to be current number
            } else if (ar[i] > second && ar[i] != first) {
                third = second;  // Update third to be second
                second = ar[i];  // Update second to be current number
            } else if (ar[i] > third && ar[i] != second && ar[i] != first) {
                third = ar[i];   // Update third to be current number
            }
        }

        // Check if we found a valid third largest
        if (third == Integer.MIN_VALUE) {
            System.out.println("There is no third largest number.");
        } else {
            System.out.println("The third largest number is: " + third);
        }
    }
}
