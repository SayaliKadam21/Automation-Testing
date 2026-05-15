package Test.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerpage_test {
	public static void main(String[]args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sayali");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kadam");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune, Maharashtra");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sayali@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8965471254");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		

	}

}
