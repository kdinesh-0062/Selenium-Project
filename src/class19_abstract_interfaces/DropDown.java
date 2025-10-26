package class19_abstract_interfaces;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://freelance-learn-automation.vercel.app/signup");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement st = driver.findElement(By.id("state"));
	Select state=new Select(st);
	List<WebElement> AllStateValue=state.getOptions();
	
	boolean allstatus=true;
	
	List<String> expectedStateValue = Arrays.asList("Bihar","Karnataka");
	for(String stateValues:expectedStateValue) {
		boolean status=false;
	
	for(WebElement el:AllStateValue) {
		String text= el.getText();
		
		if(text.contains(stateValues)) {
			status=true;
			break;
		}
	}
	
	if(!status) {
		System.out.println("not Found state  "+stateValues);
	allstatus=false;
	}}
	if(allstatus) {
		System.out.println("pass");
	}
	
		
		else {
			System.out.println("Not");
		}
	driver.quit();
	}
	
}

