package Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TestCases {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[@id='productTitle'])[1]")
	WebElement text;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']") //For Shoes add to Card Button
	WebElement cart;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")       //Click on amazon Prime Logo
	WebElement dropdown;
	
	@FindBy(xpath="(//select[@id='searchDropdownBox'])[1]")  // click on drop down option
	WebElement test;
	
	@FindBy(xpath="//option[@value='search-alias=computers']")  //select value of computers
	WebElement option;
	
	public TestCases(WebDriver driver)   {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void login2function() {
		
		System.out.println(text.getText());
	
		cart.click();

		dropdown.click();
		
		test.click();
		
		option.click();
	
		
		
	}
	
}
