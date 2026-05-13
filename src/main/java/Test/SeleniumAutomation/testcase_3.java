package Test.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public interface testcase_3 {
	static void chromebrowser() 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("incorrectPassword");
		driver.findElement(By.id("submit")).click();
		
		//Verification
		WebElement msg=driver.findElement(By.id("error"));
		System.out.println("After entering wrong password :Your password is invalid!"+msg.getText());
		
	}

}
