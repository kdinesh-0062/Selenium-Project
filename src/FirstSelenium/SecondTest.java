package FirstSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSOutput;

public class SecondTest {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options =new ChromeOptions();
WebDriver driver=new ChromeDriver(options);

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
Thread.sleep(2000);
//button[@fdprocessedid='qyuj']

//driver.findElement(By.xpath("//button[text()='ADD TO CART'])[2]")).click();
//Thread.sleep(3000);
//button[@fdprocessedid='8fv2p5']
driver.findElement(By.xpath("//img[@alt='Cart']")).click();


//img[@alt='Cart']
driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

//button[text()='PROCEED TO CHECKOUT']

driver.findElement(By.xpath("//button[text()='Place Order']")).click();

//select[@fdprocessedid='ghojpf']


Thread.sleep(5000);

//driver.findElement(By.xpath("//button[text()='Proceed']")).click();
WebElement dp=driver.findElement(By.xpath("//select[@fdprocessedid='ghojpf']"));

Select sl= new Select(dp);
//List<WebElement> sll = sl.getOptions();
sl.selectByValue("India");



sl.selectByValue("India");
sl.selectByVisibleText("India");



driver.quit();



	}

}
