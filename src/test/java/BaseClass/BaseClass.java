package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.utility;



public class BaseClass {
protected static WebDriver driver;
	
	public void launchBrowser() throws IOException
	   //Initializing the driver & Launching URL from configuration file
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Velocity\\GrowPital\\Growpital-master\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get(utility.readDataFromPropertyFile("url"));
		
		Reporter.log("launching browser", true);
	}
	

}
