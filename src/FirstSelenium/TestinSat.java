package FirstSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestinSat {
	public static void main(String[] args) throws IOException {
		
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/broken");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for (WebElement link : links) {
	    String url = link.getAttribute("href");
	    
	    if(url==null || url.isEmpty()) {
	    	continue;
	    }
	    //HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
URL urls=new URL(url);
HttpURLConnection conn = (HttpURLConnection)urls.openConnection();
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    if (conn.getResponseCode() >= 400) {
	        System.out.println("Broken: " + url);
	    }
	    else {
			System.out.println("Valid Code" +  " : "  + url);
		}
	}
	driver.quit();
	}

}