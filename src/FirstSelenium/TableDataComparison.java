package FirstSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableDataComparison {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/DINESH%20KUMAR/OneDrive/Documents/text.html"); // or replace with actual URL

        // Locate table rows under tbody
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='data-table']/tbody/tr"));

        boolean matchFound = false;

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String name = cells.get(0).getText();
            String country = cells.get(2).getText();

            // Check if Name = Alice and Country = USA
            if (name.equalsIgnoreCase("Alice") && country.equalsIgnoreCase("USA")) {
                System.out.println("Match Found: Alice and USA");
                System.out.println(country);
                System.out.println(name);
                matchFound = true;
                break; // Stop after first match
            }

            // Optional: check reverse condition if needed
            if (name.equalsIgnoreCase("USA") && country.equalsIgnoreCase("Alice")) {
                System.out.println("✅ Match Found: USA and Alice (reverse)");
                matchFound = true;
                break;
            }
        }

        if (!matchFound) {
            System.out.println("❌ No match found for (Alice, USA) or (USA, Alice)");
        }

        driver.quit();
    }
}
