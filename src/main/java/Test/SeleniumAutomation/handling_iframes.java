package Test.SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class handling_iframes {
	ChromeDriver driver;
	void launch() 
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
	}
	
	void singleiframe()
	{
		//it is used to switch webdriver
		
		//1.index
		driver.switchTo().frame(0);
		
		//2.name
		
		
	}

}
