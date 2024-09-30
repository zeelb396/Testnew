package testCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;
@Listeners(utilities.Listener.class)


public class TC003_LoginDDT extends BaseClass{

	@Test(dataProvider="LoginData",dataProviderClass= DataProviders.class)// Getting data provider from different class
	public void verify_loginDDT(String email,String pwd,String exp)
	{
	//Homepage	
	Homepage hp=new Homepage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	
	//Login Page
	LoginPage Lgp= new LoginPage(driver);
	Lgp.EnterLoginid(email);
	Lgp.EnterPassword(pwd);
	Lgp.ClickLogin();
	
	//My Account Page
	MyAccountPage mcc= new MyAccountPage(driver);
	boolean targetpage=mcc.isMyAccountPageExists();
	
	}
}
