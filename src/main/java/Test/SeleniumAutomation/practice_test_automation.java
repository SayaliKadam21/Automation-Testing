package Test.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice_test_automation {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
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
		cd.findElement(By.id("datepicker")).sendKeys("12/12/2026");
		
		//Date Picker 2 (dd/mm/yyyy)
		cd.findElement(By.name("SelectedDate")).click();
		cd.findElement(By.xpath("//a[@data-date='13']")).click();
		
		//Date Picker 3: (Select a Date Range)
		cd.findElement(By.xpath("//input[@placeholder='Start Date']")).sendKeys("10-12-2025");
		cd.findElement(By.xpath("//input[@placeholder='End Date']")).sendKeys("12-12-2026");
		cd.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		//Upload files
		cd.findElement(By.id("singleFileInput")).sendKeys("D:\\Downloads");
		cd.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		//Upload multiple files
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		cd.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Fortune cloud");
		cd.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	
//------------------------------------------------------------------------------------------------------------------
		//Pagination Web Table
		
		//WebElement checkbox = cd.findElement(By.xpath("//table[@id='productTable']//tbody/tr[1]/td[4]/input"));
		//checkbox.click();
//		List<WebElement> checkboxes = cd.findElements(By.xpath("//table[@id='productTable']//tbody/tr/td[4]/input"));
//		for(WebElement cb : checkboxes){
//		    cb.click();
//		}
		
		 // Get all pagination buttons (1,2,3,4)
        List<WebElement> pages = cd.findElements(
                By.xpath("//ul[@class='pagination']//a"));

        int totalPages = pages.size();

        // Loop through each page
        for (int i = 1; i <= totalPages; i++) {

            // Click page number
            cd.findElement(
                    By.xpath("//ul[@class='pagination']//a[text()='" + i + "']")).click();

            Thread.sleep(2000);

            System.out.println("Opened Page: " + i);

            // Get all checkboxes from current page
            List<WebElement> checkboxes = cd.findElements(
                    By.xpath("//table[@id='productTable']//tbody/tr/td[4]/input"));

            // Click each checkbox
            for (WebElement checkbox : checkboxes) {

                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }

            System.out.println("All checkboxes clicked on Page: " + i);
        }

  //---------------------------------------------------------------------------------------------------
		
		
		//Tabs
		cd.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Blog");
		cd.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		//Dynamic Button
		cd.findElement(By.xpath("//button[@name='start']")).click();
		
		//Alerts & Popups--------------------
		//Simple Alert
		cd.findElement(By.id("alertBtn")).click();
		Alert al=cd.switchTo().alert();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.accept();
			
		
		
		//Confirmation alert
		cd.findElement(By.id("confirmBtn")).click();
		Alert al2=cd.switchTo().alert();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al2.dismiss();
		
		
		//Prompt Alert
		cd.findElement(By.id("promptBtn")).click();
		Alert al3 = cd.switchTo().alert();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al3.accept();
		
		
		//New tab
		//cd.findElement(By.xpath("//button[text()='New Tab']")).click();
		//cd.navigate().back();
		
		
		//Popup window
		//cd.findElement(By.id("PopUp")).click();
		
		
		
		//Mouse Hover
		Actions act = new Actions(cd);
		act.moveToElement(cd.findElement(By.xpath("//button[text()='Point Me']"))).click().build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Double Click

	
		
		
		
		//Drag and Drop
		
		WebElement drag = cd.findElement(By.id("draggable"));
		WebElement drop = cd.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		
		
		//slider
		WebElement slider = cd.findElement(By.xpath("//span[@tabindex='0']"));
		act.dragAndDropBy(slider, 30, 0).build().perform();
		
		
		//Laptop Links
		cd.findElement(By.id("apple")).click();
		cd.navigate().back();
		Thread.sleep(1000);
		cd.findElement(By.id("lenovo")).click();
		cd.navigate().back();
		Thread.sleep(1000);
		cd.findElement(By.id("dell")).click();
		cd.navigate().back();
		Thread.sleep(1000);
		
		
		//Broken Links
		List<WebElement> bl= cd.findElements(By.partialLinkText("Errorcode"));
		System.out.println("Size of web element list is:"+bl.size());
		for(int i=0;i<bl.size();i++)
		{
			System.out.println(bl.get(i));
			bl.get(i).click();
			Thread.sleep(1000);
			cd.navigate().back();
		}
		
		//Form
		//cd.switchTo().frame(0);
		cd.findElement(By.id("input1")).sendKeys("abc");
		cd.findElement(By.id("btn1")).click();
		
		cd.findElement(By.id("input2")).sendKeys("def");
		cd.findElement(By.id("btn2")).click();
		
		cd.findElement(By.id("input3")).sendKeys("gasnfsd");
		cd.findElement(By.id("btn3")).click();
		
		
		//ShadowDOM
		
		cd.findElement(By.linkText("Blog")).click();
		cd.navigate().back();
		
		//cd.switchTo().frame(0);
		//cd.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		cd.switchTo().frame(2);
		cd.findElement(By.cssSelector("//input[type='text']")).sendKeys("Hello");
		
		
	}

}

