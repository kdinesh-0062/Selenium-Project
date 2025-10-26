package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FooterLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://data.hrsa.gov/data/about"); // Replace with your site

        // Locate footer section (by id, class, or tag)
        WebElement footer = driver.findElement(By.tagName("footer"));

        // Get all <a> tags inside footer
        List<WebElement> footerLinks = footer.findElements(By.tagName("a"));

        System.out.println("Total footer links: " + footerLinks.size());

        // Print all link texts and URLs
        for (WebElement link : footerLinks) {
            String text = link.getText();
            String url = link.getAttribute("href");
            System.out.println(text + " --> " + url);
        }

        driver.quit();
    }
}

