package FirstSelenium;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;

        System.out.print("Enter the monthly deposit amount: ");
        double monthlyDeposit = scanner.nextDouble();

 

        for (int month = 1; month <= 12; month++) {
            balance += monthlyDeposit;
            System.out.printf("Balance at the end of month %d: %.1f%n", month, balance);
        }
    }
}
