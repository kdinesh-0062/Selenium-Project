package FirstSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class WebdriverManager {
	 
	 private static WebDriver driver;
	 
	 private WebdriverManager()
	 {}
	 
	 
	 public  static WebDriver getdriver() {
		 
		 if(driver==null) {
			  driver=new ChromeDriver();
		 }
		 return driver;
		 
	 }
	 
	 public static void QuitDriver() {
		 if(driver!=null) {
			 driver.quit();
			 driver=null;
			 
		 }
	 }
	 
	 
	 
	 
		}

 
 public class SingleTonTest{
	 public static void main(String[] args) {
		 
		 String name="Dinesh";
		 String output=name.replaceAll("[aeiouAEIOU]", "");
		 System.out.println(output);
			/*
			 * WebDriver driver;
			 * 
			 * driver=WebdriverManager.getdriver();
			 * driver.get("https://www.google.com/?gws_rd=cr");
			 * System.out.println(driver.getTitle());
			 * 
			 * 
			 * 
			 * JavascriptExecutor js = (JavascriptExecutor)driver;
			 * js.executeScript("window.scrollBy(0,500)");
			 * 
			 * js.executeScript("window.ScrollTo()");
			 */
		
	}
 }