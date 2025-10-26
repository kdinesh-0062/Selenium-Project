package FirstSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinksandBack {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/broken");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<String> urlsList=new ArrayList<String>();
		for (WebElement link : links) {
		    String url = link.getAttribute("href");
		    if(url!=null && url.startsWith("http")) {
		    	urlsList.add(url);
		    	
		    }
		    
	}
		
		for(String url:urlsList) {
			driver.navigate().to(url);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			
			
		}

		driver.quit();
}
}