package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class Parrallelrun {
	public WebDriver driver;
	@Test
	public void FirefoxTest() { 
		final String URL1 = "http://demo.guru99.com/test/newtours/register.php";



		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: " +projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath+
				"/src/test/resources/drivers/geckodriver.exe"); 
		driver = new FirefoxDriver();   
		driver.get("https://www.google.com"); 
		driver.get(URL1);


	}

	@Test
	public void ChromeTest()
	{ 
		final String URL2 = "http://demo.guru99.com/test/newtours/register.php";
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: " +projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+
				"/src/test/resources/drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.google.com"); 
		driver.get(URL2);


	}

}