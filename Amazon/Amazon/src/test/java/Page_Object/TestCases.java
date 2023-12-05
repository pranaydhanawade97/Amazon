package Page_Object;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases {
	
	WebDriver driver;
	
	@FindBy(xpath="(//select[@class='a-native-dropdown a-declarative'])[1]")
	WebElement size;
	
	
	@FindBy(xpath="//option[@id='native_size_name_3']")
	WebElement no;
	
	@FindBy(xpath="//img[@alt='White/Red']")
	WebElement color;
	
	@FindBy(xpath="//select[@id='quantity']")
	WebElement quantity;
	
	
	
	
	public TestCases(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void login2function()  {
		size.click();
		no.click();
		color.click();
		quantity.click();	
		
	}
	
}