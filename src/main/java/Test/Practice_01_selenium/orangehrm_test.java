package Test.Practice_01_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm_test {
	public static void main(String[]args) {
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//wait for few seconds(if no such element exception occurs)
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		cd.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		
		cd.findElement(By.name("password")).sendKeys("admin123");
		
		
		
	}

}
