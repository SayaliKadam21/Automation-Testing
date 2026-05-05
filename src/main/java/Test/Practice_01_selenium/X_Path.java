package Test.Practice_01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	
	public static void main(String[]args) {
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://demoqa.com/automation-practice-form");
		
//1. by using attribute = //tagname[@attributename='value']
		cd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sayali");
		
		
//2.by using parenttag name and chiledtag name = //parenttagname//childtagname
		//cd.findElement(By.xpath("//div/input")).sendKeys("Kadam");
		
//3. by using indexing = (//tagname[@attribute='value'])[index]
		cd.findElement(By.xpath("//input[@placeholder='name@example.com'][1]")).sendKeys("sayali@gmail.com");
		
		
//4.by using text = (//tagname[text()='value'])
		cd.findElement(By.xpath("//label[text()='Female']")).click();
		
		
//5.by using attribute
		cd.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7822848283");


		
//6.By using tag name //tagname
		
		
		
//7.by using logical AND //tagname[@attribute='value' and @attribute='value']
		
		
//8.by using logical OR //tagname[@attribute='value' or  @attribute='value']
		
		
//9. By using contains  //tagname[contains(@attribute,'value')]
		
		
//10.By using starts-with  //tagname[Starts-with(@attribute,'value')]
		
		
		
//11.By using relative x path traversing from middle node  //parenttagname/childtagname[@attribute='value']
		
		
	
	}
	
      
}
