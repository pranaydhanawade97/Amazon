package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Test {

	
		//For Login Test Cases
		WebDriver driver;
		
		@FindBy(xpath="//input[@name='email']")
		WebElement email;
		
		@FindBy(id="continue")
		WebElement button;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement pwd;
		
		@FindBy(id="signInSubmit")
		WebElement click;
		
		@FindBy(xpath="//a[@id='nav-hamburger-menu']")
		WebElement dropdown;
		
		
		public Login_Test(WebDriver driver) {
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		public void Loginfunction(String UserNameVal, String PwdVal) {
			email.sendKeys(UserNameVal);
			button.click();
			pwd.sendKeys(PwdVal);
			click.click();
			dropdown.click();
		
	}
}


