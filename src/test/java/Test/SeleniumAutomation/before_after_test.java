package Test.SeleniumAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class before_after_test {
	
	
@Test
	void mock() {
		System.out.println("Tommorow is Our Mock");
	}

@BeforeTest
	void location() {
		System.out.println("At FCT");
	}
	
@AfterTest
	void time() {
		System.out.println("In the morning at 10 am");
	}

}
