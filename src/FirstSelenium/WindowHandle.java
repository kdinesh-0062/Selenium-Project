package FirstSelenium;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WindowHandle {
	


		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			
	        System.setProperty("webdriver.Chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			driver.findElement(By.linkText("Open a popup window")).click();
			Set<String> window = driver.getWindowHandles();
			Iterator<String> itr = window.iterator();
                 String mainwindow = itr.next();	
                 String childwindow=itr.next();
             driver.switchTo().window(childwindow);
           String childWindowone = driver.findElement(By.className("example")).getText();
           System.out.println(childWindowone);
           driver.switchTo().window(mainwindow);
           driver.close();
           driver.quit();
          
           
            }
}