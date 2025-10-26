package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class FlipkartSearchTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
      //  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    
    public void searchProductAndValidate() throws InterruptedException {
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);

        // Close login popup
        try {
            WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed");
        }

        // Search for product
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("laptop");
        searchBox.submit();
        Thread.sleep(3000);

        // Click on first product
        List<WebElement> products = driver.findElements(By.cssSelector("a._1fQZEK"));
        Assert.assertTrue(products.size() > 0, "No products found");
        products.get(0).click();

        // Switch to new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Validate title contains "Laptop"
        String pageTitle = driver.getTitle();
        System.out.println("Title: " + pageTitle);
        Assert.assertTrue(pageTitle.toLowerCase().contains("laptop"), "Title does not contain 'laptop'");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

