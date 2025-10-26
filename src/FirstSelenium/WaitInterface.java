package FirstSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue;

public class WaitInterface {
public static void main(String[] args) {
	 System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("test"))
		 * );
		 */
		
		//Assert.assertTrue(driver.getCurrentUrl().contains("DashBoard"));

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
*/
FluentWait<WebDriver> wait=new FluentWait<>(driver)
.withTimeout(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(2))
.ignoring(NullPointerException.class);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
WebElement Element = driver.findElement(By.xpath(""));
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].scrollIntoView();", Element);
//executor.executeScript("arguments[0].scrollIntoView();", Element);
}
}
