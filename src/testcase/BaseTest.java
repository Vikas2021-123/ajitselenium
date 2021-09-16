package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
 
public class BaseTest {
static WebDriver driver;
LoginPage lp;
 @Test
public void initBrowser()
 

{
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
}	 
	@BeforeClass
	public void createObject()          
	{
		lp = new LoginPage(driver);
		
	}
	public void tearDown()
	{
		driver.quit();
	}

	

}