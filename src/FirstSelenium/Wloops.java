package FirstSelenium;
import java.util.Scanner;

public class Wloops {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualRate = scanner.nextDouble() / 100;  // Convert percentage to decimal
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate and display interest for each year
        for (int year = 1; year <= years; year++) {
            // Calculate simple interest for the current year
            double interest = principal * annualRate * year;
            // Calculate total amount
            double totalAmount = principal + interest;
            // Display the interest and total amount for the current year
            System.out.printf("Year %d: Interest Earned = %.2f, Total Amount = %.1f%n", year, interest, totalAmount);
        }

        // Display final total amount after the specified number of years
        double finalTotalAmount = principal + (principal * annualRate * years);
        System.out.printf("Total amount after %d years: $%.2f%n", years, finalTotalAmount);
    }
}
