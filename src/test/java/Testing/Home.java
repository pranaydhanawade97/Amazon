package Testing;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import Page_Object.Login_Test;
import Page_Object.TestCase3;
import Page_Object.TestCases;
import Page_Object.TestCases2;
import Page_Object.TestCases4;


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
		login.Loginfunction("User_ID","Password");
		
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
			
		//driver.wait(3000);
		
		TestCases2 test = new TestCases2(driver);
		
		test.login3function("MacBook");
		
		JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
		
		scroll1.executeScript("window.scrollBy(0,150)");
		 
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
		
		test.login4function("80000");
		 
		Thread.sleep(5000); 
		
		TestCase3 test2= new TestCase3(driver);
		test2.window();
			
		
		WebElement mouse2=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions hover2= new Actions(driver);
		hover2.moveToElement(mouse2).perform();
		
		TestCases4 test3= new TestCases4(driver);
		test3.Login5function("Pranay","8655144220","400012","9/4, Sai Krupa Soc, Borivali East","Mumbai");
			
		JavascriptExecutor scroll3 = (JavascriptExecutor)driver;
		scroll3.executeScript("window.scrollBy(40,500)");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[5]")).click();
		
		
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Instagram']")).click();
		
		}   
 
	}  
	
	  

