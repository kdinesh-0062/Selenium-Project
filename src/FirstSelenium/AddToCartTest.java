package FirstSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class AddToCartTest {
    public static void main(String[] args) throws InterruptedException {

        // Setup
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Go to website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Search and add item to cart
        driver.findElement(By.cssSelector("input.search-keyword")).sendKeys("ber");
        Thread.sleep(2000); // Wait for filter results

        List<WebElement> products = driver.findElements(By.cssSelector("div.products div.product"));

        for (WebElement product : products) {
            String name = product.findElement(By.cssSelector("h4.product-name")).getText();
            if (name.contains("Cucumber")) {
                product.findElement(By.xpath(".//button[text()='ADD TO CART']")).click();
                break;
            }
        }

        // Go to cart
        driver.findElement(By.cssSelector("a.cart-icon")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        // Wait for checkout page
        Thread.sleep(2000);

        // Verify product name in cart
        String productName = driver.findElement(By.cssSelector("p.product-name")).getText();
        System.out.println("Product in cart: " + productName);

        // Click "Place Order"
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        // Select country from dropdown
        WebElement dropdown = driver.findElement(By.tagName("select"));
        dropdown.click();
        dropdown.findElement(By.xpath("//option[text()='India']")).click();

        // Check the terms checkbox
        driver.findElement(By.cssSelector("input.chkAgree")).click();

        // Click Proceed
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();

        // Done
        System.out.println("✅ Order placed successfully!");

        // Close browser
        driver.quit();
    }
}
