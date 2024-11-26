package FirstSelenium;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> shoppingList = new ArrayList<>();

		System.out.println("Enter items for your shopping list. Type 'done' when finished:");

		while (true) {
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("done")) {
				break;
			}

			shoppingList.add(input);
		}

		scanner.close();

		System.out.println("Your shopping list:");
		for (String item : shoppingList) {
			System.out.println(item);
		}
	}
}
