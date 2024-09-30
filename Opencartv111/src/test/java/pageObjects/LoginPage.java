package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver) {
	super (driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath= "//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement Btn_Login;

	public void EnterLoginid(String login)
	{
		txt_email.sendKeys(login);
	}
	public void EnterPassword(String Password)
	{
		txt_password.sendKeys(Password);
	}
	public void ClickLogin()
	{
		Btn_Login.click();
	}
}
