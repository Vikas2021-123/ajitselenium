package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.LoginPage;

public class BaseTest1 {

static WebDriver driver;
	LoginPage lp;
	
	@BeforeSuite
	public void initBrowser()
	{
		static WebDriver driver;
	LoginPage1 lp;
	 @Test
	 
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");

		driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
		
	}
	
	
	@BeforeClass
	public void createObject()
	{
		 lp = new LoginPage(driver);
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
