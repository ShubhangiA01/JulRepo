package pageextensions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLogin_PF {
		
		//Variable declaration
		@FindBy(id="login1")
		private WebElement txtusername;
		@FindBy(id="password")
		private WebElement txtpassword;
		@FindBy(name="proceed")
		private WebElement btnsingin;
		@FindBy(linkText="Create a new account")
		private WebElement lnkcreateacc;
		@FindBy(css="div#div_login_error")
		WebElement lblerror;
		//Constructor
		public RediffLogin_PF(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods
		public void login(String username, String password)
		{
			txtusername.sendKeys(username);
			txtpassword.sendKeys(password);
			btnsingin.click();
		}
		
		public void gotoRegistration()
		{
			lnkcreateacc.click();
		}
		
		public void clearData()
		{
			txtusername.clear();
			txtpassword.clear();
		}
		
		
		public void validateError(String experror)
		{
			String acterror = lblerror.getText();
			assertEquals(acterror, "Wrong username and password combination.");
		}
		
	}
	


