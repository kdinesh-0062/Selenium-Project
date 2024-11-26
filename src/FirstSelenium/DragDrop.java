package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
Thread.sleep(3000);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement seoul = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		Actions action=new Actions(driver);
		Thread.sleep(4000);
		action.dragAndDrop(seoul, norway).perform();
		Thread.sleep(3000);
	     driver.close();	
	}

}
