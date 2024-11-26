
package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUpDown {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/#");
	
    WebElement kd = driver.findElement(By.linkText("compendiumdev"));
    Actions actions=new Actions(driver);
    Thread.sleep(3000);
    //driver.close();
   // actions.keyDown(Keys.CONTROL).click(kd).keyUp(Keys.CONTROL).build().perform();
    
    WebElement user = driver.findElement(By.name("userid"));
    user.sendKeys("Dinesh");
    Thread.sleep(2000);
    user.sendKeys(Keys.chord(Keys.CONTROL,"z"));
	/*
	 * actions.sendKeys(Keys.TAB).perform();
	 * driver.findElement(By.name("pswrd")).sendKeys("Test");
	 * actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	 * actions.sendKeys(Keys.ENTER).perform();
	 */
    
    Thread.sleep(2000);
    driver.close();
}
}
