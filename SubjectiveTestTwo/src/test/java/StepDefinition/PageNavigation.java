package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageNavigation {
	
WebDriver driver= null;
	
	@BeforeTest
	public void login () {
		
		  String projectPath=System.getProperty("user.dir");
		  System.out.println("Project path is: " +projectPath);
		  System.setProperty("webdriver.chrome.driver",projectPath+
		  "/src/test/resources/drivers/chromedriver.exe"); 
		  driver = new ChromeDriver();
		System.out.println("Driver Open");
	}
	
	@Test
	public void validateLogin () throws InterruptedException {
		 driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		System.out.println("validate Navigation");
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		 
	}
	
	@AfterTest
	public void Navigation () {
		driver.close();
		System.out.println("Navigation Successfully");
	}
	

}
