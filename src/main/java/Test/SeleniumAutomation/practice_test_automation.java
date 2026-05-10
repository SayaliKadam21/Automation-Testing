package Test.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_test_automation {
	public static void main(String[]args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		
		//name
		cd.findElement(By.id("name")).sendKeys("Sayali");
		
		//Email
		cd.findElement(By.id("email")).sendKeys("sayalik1295@gmail.com");
		
		//Phone
		cd.findElement(By.id("phone")).sendKeys("9988774455");
		
		//Address
		cd.findElement(By.id("textarea")).sendKeys("Pune,Maharashtra");
		
		//Gender
		cd.findElement(By.id("female")).click();
		
		//Days
		cd.findElement(By.id("sunday")).click();
		
		
		//Country
		Select country= new Select(cd.findElement(By.id("country")));
		country.selectByIndex(9);
		
		//Colors
		Select colors = new Select(cd.findElement(By.id("colors")));
		colors.selectByVisibleText("White");
		
		//Sorted list
		Select sl = new Select(cd.findElement(By.id("animals")));
		sl.selectByValue("dog");
		
		//Date Picker 1 (mm/dd/yyyy)
		
		
		//Date Picker 2 (dd/mm/yyyy)
		
		
		//Date Picker 3: (Select a Date Range)
		
		//Upload files
		
	
	
	}

}
