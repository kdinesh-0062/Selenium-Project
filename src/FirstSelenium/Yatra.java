package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		
		WebElement data = driver.findElement(By.xpath("//input[@placeholder='From']"));
		data.sendKeys("Del");
		int i=0;
		while (i<4) {
			data.sendKeys(Keys.DOWN);
		i++;
		
		}
		
	}

}
