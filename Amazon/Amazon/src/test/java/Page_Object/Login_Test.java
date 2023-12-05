package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Test {

	
		
		WebDriver driver;
		
		@FindBy(xpath="//input[@name='email']")
		WebElement email;
		
		@FindBy(id="continue")
		WebElement button;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement pwd;
		
		@FindBy(id="signInSubmit")
		WebElement click;
		
		public Login_Test(WebDriver driver) {
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		public void Loginfunction(String UserNameVal, String PwdVal) {
			email.sendKeys(UserNameVal);
			button.click();
			pwd.sendKeys(PwdVal);
			click.click();
		
	}
}

