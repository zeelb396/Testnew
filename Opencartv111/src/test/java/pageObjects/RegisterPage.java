package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver)
	{
		super(driver);	
	}	
		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement ipt_Firstname;
		
		@FindBy(xpath="//input[@id='input-lastname']")
		WebElement ipt_Lastname;
		
		@FindBy(xpath="//input[@id='input-email']")
		WebElement ipt_email;
		
		@FindBy(xpath="//input[@id='input-telephone']")
		WebElement ipt_telephone;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement ipt_password;
		
		@FindBy(xpath="//input[@id='input-confirm']")
		WebElement ipt_confirm;
		
		@FindBy(xpath="//input[@name='agree']")
		WebElement Chkb_agree;
		
		@FindBy(xpath="//input[@value='Continue']")
		WebElement Cnf_button;
		
		

		public void setFirstName(String fname)
		{
			ipt_Firstname.sendKeys(fname);
		}

		public void setLastName(String lname)
		{
			ipt_Lastname.sendKeys(lname);
		}
		
		public void setEmail(String ename)
		{
			ipt_email.sendKeys(ename);
		}
		
		public void setTelephone(String telephone)
		{
			ipt_telephone.sendKeys(telephone);
		}
		
		public void setPassword(String password)
		{
			ipt_password.sendKeys(password);
		}
		
		public void ConfirmPassword(String password)
		{
			ipt_confirm.sendKeys(password);
		}
		
		public void Checkbox()
		{
			Chkb_agree.click();
		}
		
		public void ConfirmButton()
		{
			Cnf_button.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}






/*


driver.findElement(By.xpath("//input[@id='input-firstname']"))
driver.findElement(By.xpath("//input[@id='input-lastname']"))
driver.findElement(By.xpath("//input[@id='input-email']"))
driver.findElement(By.xpath("//input[@id='input-telephone']"))
driver.findElement(By.xpath("//input[@id='input-password']"))
driver.findElement(By.xpath("//input[@id='input-confirm']"))

*/


