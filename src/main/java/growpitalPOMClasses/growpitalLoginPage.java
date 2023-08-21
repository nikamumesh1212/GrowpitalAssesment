package growpitalPOMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.utility;

public class growpitalLoginPage 
{
	//Declaring Data Members of LoginPage
	@FindBy (xpath = "//input[@class='email-input']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@placeholder='********']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@class='custom-button ']//div[contains(text(),'Login')]")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//div[text()='Login Success']")
	private WebElement LoginSucessMessage;
	
	@FindBy(xpath = "//span[text()='Sign out']")
	private WebElement SignOutButton;
	
	
	public growpitalLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmailId() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		Email.sendKeys(utility.readDataFromPropertyFile("Email"));
	}

	public void enterPassword() throws IOException
	{
		Password.sendKeys(utility.readDataFromPropertyFile("password"));
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
	public String ValidatingLoginSucessMessage()
	{
		String Login = LoginSucessMessage.getText();;
		return Login;
		
	}
	
	public void clickOnSignOutButton()
	{
		SignOutButton.click();
	}
	
}
