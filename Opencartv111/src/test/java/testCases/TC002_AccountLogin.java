package testCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.Listener;
@Listeners(utilities.Listener.class)

public class TC002_AccountLogin extends BaseClass {
	
	@Test
	public void verify_login()
	{
		Homepage hp=new Homepage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		Listener.test.log(Status.PASS, "Login Successful");
		
		LoginPage Lgp= new LoginPage(driver);
		
		Lgp.EnterLoginid(p.getProperty("email"));
		Lgp.EnterPassword(p.getProperty("password"));
		Lgp.ClickLogin();
		
		MyAccountPage mcc= new MyAccountPage(driver);
		boolean targetpage=mcc.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true,"Page Not displayed");
	}
	

}
