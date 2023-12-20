package Page_Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases4 {
	
	WebDriver Driver;
	
	public TestCases4(WebDriver Driver) {
		this.Driver=Driver;
		
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(linkText="Your Account")
	WebElement account;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[1]")
	WebElement Orders;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[4]")
	WebElement Address;
	
	@FindBy(xpath="//div[@class='a-box-inner a-padding-extra-large']")
	WebElement newadd;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement no;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement pin;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement add;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement town2;
	

	@FindBy(xpath="(//span[@role='button'])[2]")
	WebElement state;
	
	@FindBy(xpath="(//a[normalize-space()='MAHARASHTRA'])[1]")
	WebElement Maharashtra;
	
	
	public void Login5function(String Name,String phone, String num, String address, String town) {
		
		account.click();
		Orders.click();
		
		Driver.navigate().back();
		
		Address.click();
		
		newadd.click();
		
		name.sendKeys(Name);
		
		no.sendKeys(phone);
		
		pin.sendKeys(num);
		
		add.sendKeys(address);
		
		town2.click();
		
		state.click();
		
		Maharashtra.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
