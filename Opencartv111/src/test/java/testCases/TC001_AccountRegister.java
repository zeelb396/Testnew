package testCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Homepage;
import pageObjects.RegisterPage;
import utilities.Listener;
@Listeners(utilities.Listener.class)

public class TC001_AccountRegister extends BaseClass  {

	@Test
	public void verify_Account_Register()
	{
		try
		{
		logger.info("Starting Testcase");
		Homepage hp = new Homepage(driver);
		hp.clickMyAccount();
		logger.info("Clicked");
		hp.clickRegister();
		logger.info("Clicked on registered");
		Listener.test.log(Status.PASS, "Click On registered Page");
		RegisterPage Rp = new RegisterPage(driver);
		Rp.setFirstName(randomString().toUpperCase());
		Rp.setLastName(randomString().toUpperCase());
		Rp.setEmail(randomString()+ "@yopmail.com");
		Rp.setTelephone(randomNumber());
		
		String password = randomAlphaNumeric();
		
		Rp.setPassword(password);
		Rp.ConfirmPassword(password);
		Rp.Checkbox();
		Rp.ConfirmButton();
		logger.info("logout");
		}
		catch(Exception e)
		{
			//logger.error("Test Failed");
			//logger.debug("Debug Logs...");
			//Assert.fail();
		}
		
	}		
}
