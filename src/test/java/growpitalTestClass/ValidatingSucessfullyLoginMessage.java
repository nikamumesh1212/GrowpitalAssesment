package growpitalTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import growpitalPOMClasses.growpitalHomePage;
import growpitalPOMClasses.growpitalLoginPage;
import utility.utility;


public class ValidatingSucessfullyLoginMessage extends BaseClass {

	growpitalLoginPage logIn;
	growpitalHomePage home;
	

	@BeforeClass
	public void launchGrowpitalApp() throws IOException {
		launchBrowser();
		logIn = new growpitalLoginPage(driver);
		home = new growpitalHomePage(driver);

	}

	@BeforeMethod
	public void loginToGrowpital() throws InterruptedException, IOException {
		logIn.enterEmailId();
		Thread.sleep(2000);
		logIn.enterPassword();
		Thread.sleep(2000);
		logIn.clickOnLoginButton();
		Thread.sleep(3000);


	}

	@Test(priority = 1)
	public void validateSucessfullLoginMessage() throws InterruptedException, IOException {
		Assert.assertEquals(logIn.ValidatingLoginSucessMessage(), "Login Success",
				"Actual and Expected user Names are not matching TC is failed");
		utility.takeScreenshot(driver, "SucessfullLogin");
		Thread.sleep(5000);
		home.ClickonUserID();

	}

	@Test(priority = 2)
	public void validateUserName() throws InterruptedException, IOException {
		Thread.sleep(5000);
		home.ClickonUserID();
		Thread.sleep(2000);
		Assert.assertEquals(home.ValidateUsername(), "Nayan Uttam More",
				"Actual and Expected user Names are not matching TC is failed");
		utility.takeScreenshot(driver, "UserName");

	}

	@Test(priority = 3)
	public void validateEmailId() throws InterruptedException, IOException {
		home.ClickonUserID();
		Thread.sleep(2000);
		Assert.assertEquals(home.ValidateUserEmailID(), "nayanmore7847@gmail.com",
				"Actual and Expected user Names are not matching TC is failed");
		utility.takeScreenshot(driver, "EmailId");
	}
	
	@AfterMethod
	
	public void SignOutApplication()
	{
		logIn.clickOnSignOutButton();
	}
	
	@AfterClass
	
	public void closeBrowser()
	{
		driver.close();
	}
	
}

