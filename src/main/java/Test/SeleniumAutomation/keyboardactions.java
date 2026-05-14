package Test.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardactions {
	public static void main(String[]args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement web = driver.findElement(By.tagName("textarea"));
		web.sendKeys("Software Testing");
		web.sendKeys(Keys.ENTER);
	
		//Navigation
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		WebElement sc  = driver.findElement(By.id("small-searchterms"));
		sc.sendKeys("Books");
		sc.sendKeys(Keys.ENTER);
		
		//Register
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sayali");
		
		//Copy paste
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys(Keys.CONTROL+"A");
		fname.sendKeys(Keys.CONTROL+"C");
		
		WebElement lname = driver.findElement(By.id("LastName"));
		lname.sendKeys(Keys.CONTROL+"V");

		
	}
	
}
