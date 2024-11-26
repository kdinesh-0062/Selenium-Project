package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		Actions action=new Actions(driver);
		Thread.sleep(3000);

		WebElement source = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		action.dragAndDropBy(source, 200, 0).perform();
		driver.close();
		
		
		
	}

}
