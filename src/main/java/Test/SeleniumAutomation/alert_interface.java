package Test.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_interface {
	public static void main(String[]args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://demoqa.com/alerts");

//		cd.findElement(By.id("alertButton")).click();
//		Alert al = cd.switchTo().alert();
//		al.accept();
		
		cd.findElement(By.id("timerAlertButton")).click();
		Alert ale = cd.switchTo().alert(); 
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		ale.accept();
	}

}
