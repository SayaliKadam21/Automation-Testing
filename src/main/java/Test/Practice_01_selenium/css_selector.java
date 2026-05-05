package Test.Practice_01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
	}

}
