package growpitalTestClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import growpitalPOMClasses.growpitalHomePage;
import growpitalPOMClasses.growpitalLoginPage;
import growpitalPOMClasses.growpitalProfilePagePersonal;
import growpitalPOMClasses.growpitalUploadDocuments;
import utility.utility;


public class ValidatingUploadFiles extends BaseClass
{
  
	growpitalLoginPage logIn;
	growpitalHomePage home;
	growpitalProfilePagePersonal personalInfo;
	growpitalUploadDocuments Upload;
	
	@BeforeClass
	public void launchGrowpitalApp() throws IOException {
		launchBrowser();
		logIn = new growpitalLoginPage(driver);
		home = new growpitalHomePage(driver);
		personalInfo = new growpitalProfilePagePersonal(driver);
		Upload=new growpitalUploadDocuments(driver);
	
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
		Thread.sleep(2000);
		Upload.uploadDocumentButton();
		Thread.sleep(2000);
		utility.scroll(driver);
		Thread.sleep(1000);
		
	}
	
	@Test(priority=1)
	  public void ValidationOfUploadingPancard() throws InterruptedException, IOException 
	  {
		Upload.PANUpload();
		Thread.sleep(2000);
		Upload.ClickonPANUploadButton();
		Thread.sleep(2000);
		utility.takeScreenshot(driver, "Pancard");
		Thread.sleep(2000);
		home.ClickonUserID();
		
	  }
	
	@Test(priority=2)
	  public void ValidationOfUploadingAadhaarcard() throws InterruptedException, IOException 
	  {
		Upload.AdhaarUpload();
		Thread.sleep(2000);
		Upload.ClickonAdhaarUploadButton();
		Thread.sleep(2000);
		utility.takeScreenshot(driver, "Aadhaarcard");
		Thread.sleep(2000);
		home.ClickonUserID();
		
	  }
	
	@Test(priority=3)
	  public void ValidationOfUploadingCancelledCheque() throws InterruptedException, IOException 
	  {
		Upload.CancelledChequeUpload();
		Thread.sleep(2000);
		Upload.ClickonCancelledChequeUploadButton();
		Thread.sleep(2000);
		utility.takeScreenshot(driver, "CancelledCheque");
		Thread.sleep(2000);
		home.ClickonUserID();
		
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
