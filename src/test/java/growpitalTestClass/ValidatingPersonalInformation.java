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
import growpitalPOMClasses.growpitalProfilePagePersonal;
import utility.utility;


public class ValidatingPersonalInformation extends BaseClass {

	growpitalLoginPage logIn;
	growpitalHomePage home;
	growpitalProfilePagePersonal personalInfo;

	@BeforeClass
	public void launchGrowpitalApp() throws IOException {
		launchBrowser();
		logIn = new growpitalLoginPage(driver);
		home = new growpitalHomePage(driver);
		personalInfo = new growpitalProfilePagePersonal(driver);

	}

	@BeforeMethod
	public void loginToGrowpital() throws InterruptedException, IOException {
		logIn.enterEmailId();
		Thread.sleep(1000);
		logIn.enterPassword();
		Thread.sleep(1000);
		logIn.clickOnLoginButton();
		Thread.sleep(1000);
		home.ClickonUserID();
		Thread.sleep(1000);
		home.ClickonViewProfile();
		Thread.sleep(1000);
		utility.scroll(driver);

	}

	@Test(priority = 1)
	public void ValidationOfUserType() throws InterruptedException, IOException {
		Assert.assertEquals(personalInfo.ValidateUserType(), "INDIAN",
				"Actual and Expected user Names are not matching TC is failed");
		utility.takeScreenshot(driver, "PersonalInfo");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void ValidationOfFullName() throws InterruptedException {
      
		Assert.assertEquals(personalInfo.ValidateFullName(), "Nayan Uttam More",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	
	public void ValidationOfPanNo() throws InterruptedException {
		Assert.assertEquals(personalInfo.ValidatePanNo(), "DRHPM0749F",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public void ValidationOfAadhaarCard() throws InterruptedException {
		Assert.assertEquals(personalInfo.ValidateAadhaarCardNo(), "606246441231",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	public void ValidationOfEmail() throws InterruptedException {
		Assert.assertEquals(personalInfo.ValidateEmail(), "nayanmore7847@gmail.com",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 6)
	public void ValidationOfPhoneNumber() throws InterruptedException {
		Assert.assertEquals(personalInfo.ValidatePhoneNo(), "+918788911616",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 7)
	public void ValidationOfDateofBirth() throws InterruptedException {
		Assert.assertEquals(personalInfo.ValidateDateofBirth(), "1996-04-16",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@Test(priority = 8)
	public void ValidationOfAddress() throws InterruptedException {
		Assert.assertEquals(personalInfo.ValidateAddress(),
				"Vittamm 136 West, GajananHousing Society, Saidapur Karad, Satara, Maharashtra, ",
				"Actual and Expected user Names are not matching TC is failed");
		home.ClickonUserID();
		Thread.sleep(1000);
	}

	@AfterMethod

	public void SignOutApplication() throws InterruptedException {
		Thread.sleep(1000);
		logIn.clickOnSignOutButton();
	}

	@AfterClass

	public void closeBrowser() {
		driver.close();
	}
}
