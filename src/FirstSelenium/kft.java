package FirstSelenium;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kft {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Open Flipkart
        driver.get("https://www.flipkart.com");

        Thread.sleep(2000); // Wait for pop-up

        // Close login popup if present
     

        // Search for a product
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("laptop");
        searchBox.submit();

        Thread.sleep(5000); // Wait for search results

        // Get all product containers
        List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));
        products.size();

     

            String ratingString=driver.findElement(By.xpath("//div[contains(@class,'XQDdHH')]")).getText();
            float ra= Float.parseFloat(ratingString);
            
            for(int i=0;i<ra;i++) {
                if (ra > 4.0) {
                    System.out.println("Title: " + products.get(i).getText() + " | Rating: " + ratingString);
                }
            }
        

        driver.quit();
    }


	}


