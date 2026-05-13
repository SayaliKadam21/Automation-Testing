package Test.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface testcase_2 {
	static void firefoxbrowser() 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("incorrectUser");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		//Verification
		WebElement msg=driver.findElement(By.id("error"));
		System.out.println("After wrong username:"+msg.getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
