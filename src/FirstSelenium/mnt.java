package FirstSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mnt {
 public static void main(String[] args) throws InterruptedException {
	 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		
		 // Close login popup if appears
		

        try {
        	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click(); // to close login modal
        } catch (Exception ignored) {}

        // Select 'One Way' trip
        WebElement oneWayRadioButton = driver.findElement(By.xpath("//label[@for='oneWayTrip']"));
        oneWayRadioButton.click();

        // Enter 'From' city (Bangalore)
        WebElement fromCityInput = driver.findElement(By.xpath("//input[@id='fromCity']"));
        fromCityInput.click();
        WebElement fromCitySearch = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromCitySearch.sendKeys("Bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();

        // Enter 'To' city (Goa)
        WebElement toCityInput = driver.findElement(By.xpath("//input[@id='toCity']"));
        toCityInput.click();
        WebElement toCitySearch = driver.findElement(By.xpath("//input[@placeholder='To']"));
        toCitySearch.sendKeys("Goa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Goa, India')]")).click();

        // Open the calendar to select departure date
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        Thread.sleep(1000);

        // Select a date within the next month (e.g., 20 days from now)
        List<WebElement> availableDates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
        for (WebElement date : availableDates) {
            if (date.isEnabled()) {
                date.click(); // Click the first available date
                break;
            }
        }

        // Click the 'Search' button to find flights
        driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
        Thread.sleep(8000); // Wait for the flight results to load

        // Extract flight prices and find the lowest fare
        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='listingCard']//div[@class='blackText fontSize18 blackFont white-space-no-wrap']"));
        int lowestPrice = Integer.MAX_VALUE;
        WebElement lowestPriceFlight = null;

        for (WebElement priceElement : priceElements) {
            try {
                String priceText = priceElement.getText().replaceAll("[^0-9]", "");
                int price = Integer.parseInt(priceText);
                if (price < lowestPrice) {
                    lowestPrice = price;
                    lowestPriceFlight = priceElement;
                }
            } catch (Exception e) {
                continue;
            }
        }

        // If a lowest-priced flight is found, click 'Book Now'
        if (lowestPriceFlight != null) {
            System.out.println("Lowest Price Found: ₹" + lowestPrice);
            WebElement bookNowButton = lowestPriceFlight.findElement(By.xpath("ancestor::div[@class='listingCard']//button[contains(text(),'Book')]"));
            bookNowButton.click();
        } else {
            System.out.println("No flights or prices found.");
        }}}

        // Proceed with the booking process as needed (e.g., filling in passenger details)

        // Close the browser after the task is complete
        // driver.quit();