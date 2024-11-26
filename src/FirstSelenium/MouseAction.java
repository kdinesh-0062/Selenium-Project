package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		WebElement mouse = driver.findElement(By.id("blogsmenu"));
		Actions action= new Actions(driver);
		action.moveToElement(mouse).perform();
		Thread.sleep(3000);
		WebElement Sele4 = driver.findElement(By.xpath("//span[normalize-space()='Selenium143']"));
		action.moveToElement(Sele4).click().build().perform();
		driver.close();
	}

}
