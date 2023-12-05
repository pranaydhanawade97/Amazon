package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page_Object.Login_Test;
import Page_Object.TestCases;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Home extends BaseClass {
		
		@Test
		public void login() throws InterruptedException {
		
		//2.Click on Login Click
		WebElement mouse=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions hover= new Actions(driver);
		hover.moveToElement(mouse).perform();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		//3.Login Amazon Webpage using Page Object Model
		
		Login_Test login = new Login_Test(driver);
		login.Loginfunction("pranaydhanawade89.pd@hotmail.com","Access123#$");
		
		
		
		//7.Drop Down Option 
		WebElement dropdown=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		dropdown.click();
		
		//8.Get Output of Customer Name 
		WebElement customer=driver.findElement(By.linkText("Hello, Pranay"));
		
		String p=customer.getText();
		
		System.out.println("Customer Name: "+ p);
		
		//9.Click on Best Seller
		driver.findElement(By.xpath("(//a[@class='hmenu-item'])[1]")).click();
		
		//Scroll Page 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1500)");	
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//Click on Product
		WebElement product=driver.findElement(By.xpath("(//img[@alt='Red Tape Casual Sneaker Shoes for Men | Stylish and Comfortable'])[1]"));
		product.click();
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		
		jss.executeScript("window.scrollBy(0,150)");	
		//Select Size and Color 
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		TestCases sizee= new TestCases(driver);
	
		sizee.login2function();
		
		
		JavascriptExecutor up = (JavascriptExecutor) driver;
		
		up.executeScript("window.scrollBy(0, -200)");
		
		driver.wait(5000);
		
		Select quantity = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		
		quantity.selectByValue("4");
		
		
		
		}

	}
	
	

