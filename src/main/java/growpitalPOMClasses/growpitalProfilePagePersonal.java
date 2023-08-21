package growpitalPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growpitalProfilePagePersonal 
{
	@FindBy (xpath = "//input[@value='INDIAN']")
	private WebElement nationality;
	
	@FindBy (xpath = "//input[@value='Nayan Uttam More']")
	private WebElement name;
	
	@FindBy (xpath = "//input[@value='DRHPM0749F']")
	private WebElement panNo;
	
	@FindBy (xpath = "//input[@value='606246441231']")
	private WebElement aadhaarNo;
	
	@FindBy (xpath = "//input[@value='nayanmore7847@gmail.com']")
	private WebElement emailId;
	
	@FindBy (xpath = "//input[@value='+918788911616']")
	private WebElement contactNo;
	
	@FindBy (xpath = "//input[@value='1996-04-16']")
	private WebElement DOB;
	
	@FindBy (xpath = "//textarea[contains(text(),'Vittamm 136 West, GajananHousing Society, Saidapur')]")
	private WebElement Address;
	
	
	public growpitalProfilePagePersonal(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String ValidateUserType() throws InterruptedException 
	{
		Thread.sleep(1000);
        String UserType=nationality.getAttribute("value");
        return UserType;
		
	}
	
	public String ValidateFullName() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String Name=name.getAttribute("value");
    	return Name;
    }
	
	public String ValidatePanNo() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String PanNo=panNo.getAttribute("value");
    	return PanNo;
    }
	
	public String ValidateAadhaarCardNo() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String Aadhaar=aadhaarNo.getAttribute("value");
    	return Aadhaar;
    }
	
	public String ValidateEmail() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String Mail=emailId.getAttribute("value");
    	return Mail;
    }
	
	public String ValidatePhoneNo() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String phoneNo=contactNo.getAttribute("value");
    	return phoneNo;
    }
	
	public String ValidateDateofBirth() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String DateofBirth=DOB.getAttribute("value");
    	return DateofBirth;
    }
	
	public String ValidateAddress() throws InterruptedException
    {
    	Thread.sleep(1000);
    	String residence=Address.getAttribute("value");
    	return residence;
    }

	
	
	
	
	
}
