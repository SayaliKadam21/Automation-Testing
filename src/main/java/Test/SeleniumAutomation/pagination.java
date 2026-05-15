package Test.SeleniumAutomation;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://testautomationpractice.blogspot.com/");
		
		
		
		
		  List<WebElement> pages = driver.findElements(
	                By.xpath("//ul[@class='pagination']//a"));

	        int totalPages = pages.size();

	        // Loop through each page
	        for (int i = 1; i <= totalPages; i++) {

	            // Click page number
	            driver.findElement(
	                    By.xpath("//ul[@class='pagination']//a[text()='" + i + "']")).click();

	            Thread.sleep(2000);

	            System.out.println("Opened Page: " + i);

	            // Get all checkboxes from current page
	            List<WebElement> checkboxes = driver.findElements(
	                    By.xpath("//table[@id='productTable']//tbody/tr/td[4]/input"));

	            // Click each checkbox
	            for (WebElement checkbox : checkboxes) {

	                if (!checkbox.isSelected()) {
	                    checkbox.click();
	                }
	            }

	            System.out.println("All checkboxes clicked on Page: " + i);
	        }

		
		
	}

}
