package FirstSelenium;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmt {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		Thread.sleep(3000);
driver.findElement(By.xpath("//li[@class='menu_Flights']")).click();

 WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
 from.click();
WebElement fromcity = driver.findElement(By.xpath("//input[@placeholder='From']"));
fromcity.sendKeys("Bangalore");

Thread.sleep(2000);
driver.findElement(By.xpath("(//p[contains(text(),'Bengaluru International Airport')])")).click();
Thread.sleep(2000);

WebElement toCityInput = driver.findElement(By.xpath("//input[@id='toCity']"));
toCityInput.click();
WebElement toCitySearch = driver.findElement(By.xpath("//input[@placeholder='To']"));
toCitySearch.sendKeys("Goa");
Thread.sleep(2000);
driver.findElement(By.xpath("//p[contains(text(),'Goa - Dabolim Airport, India')]")).click();
Thread.sleep(2000);

//driver.findElement(By.xpath("//div[@data-test='component-Departure-Calendar']")).click();
//Thread.sleep(2000);

List<WebElement> availableDates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
availableDates.get(0).click();

/*
 * for(WebElement date:availableDates) { if(date.isEnabled()) { date.click();
 * break; } }
 */

Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();

Thread.sleep(8000);

List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='listingCard  appendBottom5']//span[@class=' fontSize18 blackFont']"));


 int lowerPrice = Integer.MAX_VALUE;
 WebElement lowestFlight=null;
 
 for( WebElement PriceEle:priceList) {
	 try {
	String priceText = PriceEle.getText();
	int price = Integer.parseInt(priceText);
	
	if(price<lowerPrice) {
		lowerPrice=price;
		lowestFlight=PriceEle.findElement(By.xpath("//div[contains(@class,'listingCard')]"));
	}
	 
 }
 
 catch (Exception e) {
	 System.out.println("Error" + e.getMessage());
	// TODO: handle exception
}}

 
 if(lowestFlight!=null) {
	 System.out.println("Lowest price"+ lowerPrice);
	WebElement BookButton = lowestFlight.findElement(By.xpath("(//button[contains(text(),'BOOK NOW')])[2]"));
	// driver.findElement(By.xpath("(//button[contains(text(),'BOOK NOW')])[2]"));
	BookButton.click();
	 
 }
 else {
	System.out.println("not found");
}
 
	}

}
