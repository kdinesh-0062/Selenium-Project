package FirstSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropDown {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));		
		
		List<WebElement> list = driver.findElements(By.xpath(""));
		
		for(WebElement Opt:list) {
			if(Opt.getText().equalsIgnoreCase("Testing"));
			Opt.click();
			break;
		}
	}

}
