package Test.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cross_browser_test {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // Change browser here: chrome / edge / firefox
        String browser = "edge";

        // Launch Browser
        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else if(browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        // =========================
        // TEST CASE 1
        // Positive Login Test
        // =========================

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        // Verify URL
        String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("practicetestautomation.com/logged-in-successfully/")) {

            System.out.println("URL Verification Passed");

        } else {

            System.out.println("URL Verification Failed");
        }

        // Verify Success Message
        String pageText = driver.findElement(By.tagName("body")).getText();

        if(pageText.contains("Congratulations") || 
           pageText.contains("successfully logged in")) {

            System.out.println("Success Message Verification Passed");

        } else {

            System.out.println("Success Message Verification Failed");
        }

        // Verify Logout Button
        boolean logoutButton =
                driver.findElement(By.linkText("Log out")).isDisplayed();

        if(logoutButton) {

            System.out.println("Logout Button Displayed");

        } else {

            System.out.println("Logout Button Not Displayed");
        }

        // =========================
        // TEST CASE 2
        // Negative Username Test
        // =========================

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("incorrectUser");

        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        // Verify Error Message
        String errorMessage1 =
                driver.findElement(By.id("error")).getText();

        if(errorMessage1.contains("Your username is invalid!")) {

            System.out.println("Negative Username Test Passed");

        } else {

            System.out.println("Negative Username Test Failed");
        }

        // =========================
        // TEST CASE 3
        // Negative Password Test
        // =========================

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("incorrectPassword");

        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        // Verify Error Message
        String errorMessage2 =
                driver.findElement(By.id("error")).getText();

        if(errorMessage2.contains("Your password is invalid!")) {

            System.out.println("Negative Password Test Passed");

        } else {

            System.out.println("Negative Password Test Failed");
        }

        // Close Browser
        driver.quit();
    }
}