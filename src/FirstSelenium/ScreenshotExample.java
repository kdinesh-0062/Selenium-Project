package FirstSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		TakesScreenshot tS=(TakesScreenshot)driver;
		
		File src = tS.getScreenshotAs(OutputType.FILE);
		File dest= new File("Screenshot\\google.png");
		FileUtils.copyFile(src, dest);
		
		System.out.println("Successfully");
		
		Thread.sleep(1000);
		driver.quit();
	}

}
