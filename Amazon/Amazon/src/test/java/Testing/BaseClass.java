package Testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void openchrome() {
	
	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/");

	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	}
	
}
