package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

public class utility {
	
	//Method for fetching data from Configuration/property file
	 public static String readDataFromPropertyFile(String key) throws IOException
	  {
		 Properties prop=new Properties();
		 FileInputStream myfile=new FileInputStream("C:\\Automation_Velocity\\GrowPital\\Growpital-master\\myproperty.properties");
		 prop.load(myfile);
		 String value = prop.getProperty(key);
		 return value;
	  }
	
	 //Method for getting screenshot
	 public static void takeScreenshot(WebDriver driver, String random) throws IOException, InterruptedException 
		{
		    String s=RandomString.make(2);
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Automation_Velocity\\GrowPital\\Growpital-master\\Growpital_Screenshots");
			FileHandler.copy(src, dest);
			
		}
	 
	//Method for Scrolling the page
	 public static void scroll(WebDriver driver) 
		{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
		}


}
