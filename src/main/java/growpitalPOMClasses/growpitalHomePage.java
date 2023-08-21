package growpitalPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growpitalHomePage {
	
	@FindBy(xpath = "//div[@class='user-name']")
	private WebElement UserIDArrow;
	
	@FindBy(xpath = "//div[@class='popup-header']//div[@class='user-full-name'][normalize-space()='Nayan Uttam More']")
	private WebElement Username;
	
	@FindBy(xpath = "//div[@class='user-email']")
	private WebElement UserMail;
	
	@FindBy(xpath = "//span[normalize-space()='View Profile']")
	private WebElement ViewProfile;


	public growpitalHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

    public void ClickonUserID() throws InterruptedException
    {
    	Thread.sleep(5000);
    	UserIDArrow.click();
    	
    }
    
    public String ValidateUsername() throws InterruptedException
    {
    	Thread.sleep(2000);
    	String Name=Username.getText();
    	return Name;
    	
    }
	
    public String ValidateUserEmailID() throws InterruptedException
    {
    	Thread.sleep(2000);
    	String Email=UserMail.getText();
    	return Email;
    	
    }
	
    public void ClickonViewProfile() throws InterruptedException
    {
    	Thread.sleep(5000);
    	ViewProfile.click();
    	
    }
}