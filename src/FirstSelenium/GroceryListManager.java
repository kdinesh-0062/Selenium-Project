package FirstSelenium;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListManager {

    private List<String> groceryList;
    private Scanner scanner;

    public GroceryListManager() {
        groceryList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Grocery List Manager");
        System.out.println("1. Add item");
        System.out.println("2. Remove item");
        System.out.println("3. View items");
        System.out.println("4. Clear all items");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public void addItem() {
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        groceryList.add(item);
        System.out.println("Item added.");
    }

    public void removeItem() {
        System.out.print("Enter the item to remove: ");
        String item = scanner.nextLine();
        if (groceryList.remove(item)) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void viewItems() {
        if (groceryList.isEmpty()) {
            System.out.println("Grocery list is empty.");
        } else {
            System.out.println("Current items in the grocery list:");
            for (String item : groceryList) {
                System.out.println("- " + item);
            }
        }
    }

    public void clearItems() {
        groceryList.clear();
        System.out.println("All items have been cleared.");
    }

    public void start() {
        int choice;
        do {
            displayMenu();
            choice = getIntInput();
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    clearItems();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // clear invalid input
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.start();
    }
}

