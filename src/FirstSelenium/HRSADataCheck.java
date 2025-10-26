package FirstSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class HRSADataCheck {
    public static void main(String[] args) {
        // Set path if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://data.hrsa.gov/data/about");
        //boolean matchFound = false;

        // Get today's date in expected format (like "07/29/2025")
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String currentDate = today.format(formatter);

        // Get all rows from the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr"));

      // System.out.println("Records with 'Daily' Refresh Cycle and today's date (" + currentDate + "):\n");

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

           
                String dataset = cells.get(0).getText();
                String refreshCycle = cells.get(3).getText();
                String sourceDate = cells.get(2).getText();

                if (refreshCycle.equalsIgnoreCase("Daily") && sourceDate.equals(currentDate)) {
                	System.out.println("Dataset: " + dataset +
                            ", Refresh Cycle: " + refreshCycle +
                            ", Source Date: " + sourceDate);
                    //System.out.println(refreshCycle);
                   // System.out.println(sourceDate);
                    //matchFound=true;
                    //break;
                }
                
                }
				/*
				 *  if(!matchFound) {  System.out.println("Not found");  }
				 */        

      driver.quit();
    }
}
