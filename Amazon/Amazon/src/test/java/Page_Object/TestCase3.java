package Page_Object;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase3 {
	
	WebDriver driver;
	
	public TestCase3(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[1]")      //click on add to card
	WebElement card2;
	
	
	@FindBy(xpath="//a[@href='/cart?ref_=sw_gtc']")     //click on card
	WebElement card3;
	
	@FindBy(xpath="(//span[@id='a-autoid-0-announce'])[1]")  //click on quantity
	WebElement card4;
	
	@FindBy(xpath="//a[@id='quantity_5']")  //select 6 as quantity 
	WebElement quant;
	
	@FindBy(xpath="//input[@value='Proceed to checkout']")  //click on proceed to checkout 
	WebElement checkout;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-logo clickable-heading']")
	WebElement logo;
	
	@FindBy(xpath="//a[@id='a-autoid-1-announce']")
	WebElement back;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")       //Click on amazon Prime Logo
	WebElement logo2;
	
	
	public void window() throws InterruptedException {
		
	String parentWindowHandle = driver.getWindowHandle();
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for (String windowHandle : allWindowHandles) {
		    if (!windowHandle.equals(parentWindowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		
		card2.click();
		card3.click();
		card4.click();
		quant.click();
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //taking a screen shot 
		 
		 String screenshotPath = "D:\\Screenshots\\test.png";
		 
		 try {
	            
	            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
	            System.out.println("Screenshot saved: " + screenshotPath);
	        } catch (IOException e) {
	            System.out.println("Unable to save screenshot: " + e.getMessage());
	        }
		
		
		checkout.click();
		
		logo.click();
		
		Thread.sleep(4000);
		
		back.click();
		
		logo2.click();
	}
}
