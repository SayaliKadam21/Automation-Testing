package Test.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public interface testcase_1 {
	static void edgebrowser() 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		//Verification
		WebElement msg=driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		System.out.println("After Login:"+msg.getText());
		driver.close();
	}

}
