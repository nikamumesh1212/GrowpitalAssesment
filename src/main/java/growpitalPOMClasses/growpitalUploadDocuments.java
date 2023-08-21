package growpitalPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growpitalUploadDocuments 
{

	@FindBy (xpath = "//div[text()='Upload Documents']")
	private WebElement uploadDocument;
	
	@FindBy (xpath = "(//input[@type='file'])[1]")
	private WebElement PAN;
	
	@FindBy (xpath = "(//input[@type='file'])[2]")
	private WebElement Adhaar;
	
	@FindBy (xpath = "(//input[@type='file'])[3]")
	private WebElement CancelledCheque;
	
	@FindBy (xpath = "(//div[text()='Upload'])[1]")
	private WebElement PANUploadButton;
	
	@FindBy (xpath = "(//div[text()='Upload'])[2]")
	private WebElement AdhaarUploadButton;
	
	@FindBy (xpath = "(//div[text()='Upload'])[3]")
	private WebElement CancelledChequeUploadButton;
	
	@FindBy (xpath = "//em[@class='siqico-close']")
	private WebElement Closepopup;
	
	
	public growpitalUploadDocuments(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void uploadDocumentButton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	uploadDocument.click();	
    }
	
	public void PANUpload() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	PAN.sendKeys("C:\\Users\\nayan\\Documents\\MyWorkplace\\Sundaylabs.io\\UploadDocuments\\pan-card.png");	
	    }
	
	 public void ClickonPANUploadButton() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	PANUploadButton.click();	
	    }
	
	 public void AdhaarUpload() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	Adhaar.sendKeys("C:\\Users\\nayan\\Documents\\MyWorkplace\\Sundaylabs.io\\UploadDocuments\\Aadhaar_card.jpg");	
	    }
	
	 public void ClickonAdhaarUploadButton() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	AdhaarUploadButton.click();	
	    }
	 
	 public void CancelledChequeUpload() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	CancelledCheque.sendKeys("C:\\Users\\nayan\\Documents\\MyWorkplace\\Sundaylabs.io\\UploadDocuments\\Cancelled-cheque.jpeg");	
	    }
	 
	 
	 public void ClickonCancelledChequeUploadButton() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	CancelledChequeUploadButton.click();	
	    }
	
	 public void ClickonClosePopUp() throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	Closepopup.click();	
	    }
	
}
