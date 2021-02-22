package StepDefinition;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ListAllLinks {


	public static void main(String[] args) throws IOException{
		WebDriver driver = null;
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: " +projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+
				"/src/test/resources/drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		System.out.println("Driver Open");

		driver.get("https://maveric-systems.com/"
				+ "");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		driver.quit();
	}
}



