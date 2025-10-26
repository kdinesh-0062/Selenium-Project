package FirstSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.page.Page.GetAppIdResponse;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		String browser="chrome";
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.Edge.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		//driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().getPageLoadTimeout();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("testing");
		Thread.sleep(2000);
		//ul[@role='listbox']//li/descendant::div[@class='lnnVSe']
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='lnnVSe']"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		//int size = list.size();
		Thread.sleep(2000);
		System.out.println(list.size());
		
		/*
		 * for(int i=0;i<size;i++) { System.out.println(list.get(i).getText());
		 * if(list.get(i).getText().contains("testing tool")){ list.get(i).click();
		 * break;
		 * 
		 * } }
		 */
		for(WebElement ls:list) {
			String text = ls.getText();
			if(text.equalsIgnoreCase("Testing")) {
				System.out.println(text);
				ls.click();
				break;
			}
		}
		
	}

}
