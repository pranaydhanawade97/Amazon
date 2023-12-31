package Page_Object;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases2 {
	
	WebDriver driver;
	
	public TestCases2(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")  //input search box and search mackbook
	WebElement search;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")   //click on all prime from filter section
	WebElement allprime;
	
	@FindBy( xpath="(//i[@class='a-icon a-icon-checkbox'])[4]")   //click on delivery in two days 
	WebElement getin;
	
	@FindBy(xpath="//input[@id='high-price']")	//select high value and enter 80000
	WebElement highprice;
	
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")
	WebElement lap;
	
	
	
	
	
	public void login3function(String product) throws InterruptedException  {
		
		search.sendKeys(product);
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		allprime.click();
		getin.click();
		
				
	}
	public void login4function(String price) throws InterruptedException  {
		
		highprice.sendKeys(price);
		lap.click();
		Thread.sleep(2000);
		
		System.out.println(lap.getText());	
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
