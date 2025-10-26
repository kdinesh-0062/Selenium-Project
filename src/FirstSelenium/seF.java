package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class seF {

    public static void main(String[] args) throws InterruptedException {

        // Set path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Optional: Remove automation banner
        //ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
       // options.setExperimentalOption("useAutomationExtension", false);

      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();

        // Navigate to Flipkart
        driver.get("https://www.flipkart.com");
        Thread.sleep(3000); // Wait for page to load

        // Close login popup if present
        try {
            WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closeButton.click();
        } catch (Exception e) {
            System.out.println("Popup not shown.");
        }

        // Search for a dynamic product
        String searchTerm = "smartphone"; // <-- change this to any product
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.submit();

        Thread.sleep(5000); // Wait for results to load

        // Find all product containers (cards)
        List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));

        System.out.println("Products with rating > 4.5:");
        System.out.println("---------------------------------");

        // Loop through the product list using a for loop
        for (int i = 0; i < products.size(); i++) {
            WebElement product = products.get(i);

            
               
              // String title=product.findElement(By.cssSelector("KzDlHZ")).getText();
                // Get rating (if available)
                String rating = product.findElement(By.cssSelector("div._XQDdHH")).getText();

                // Convert to double and check
                if (!rating.isEmpty()) {
                    double ratg = Double.parseDouble(rating);
                    if (ratg > 4.0) {
                        System.out.println("Product: " + ratg + " | Rating: " + rating);
                    }
                }

        }
        

        driver.quit();
    }
}
