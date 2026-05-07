package Test.Practice_01_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
//1. By using attribute tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Sayali");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kadam");
		
//2. By using id tagname#id value
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("sayali@gmail.com");
		
//3. By using class tagname.class name
		
 
		
		
//4. By using indexing (tagname[attribute='value'])[index]
		//I used X path here//
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		
		
//5. By using contains(*) tagname[attribute*='value']
		
		
		
//6. By using starts with(^)   tagname[attribute^='value']
		
		
		
//7. By using ends with($)    tagname[attribute $='value']
		
		
		
//8. By using multiple attributes tagname[attribute='value'][attribute='value']
		
		
		
		
//9. id+attribute  tagname#idvalue[attribute='value']
		
		
		
//10. class attribute  tagname.classname[attribute='value']
		
	}

}
