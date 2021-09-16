package sonamtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassA {
	
	@BeforeSuite
	public void logintohrm1()
	{
		System.out.println(" before suite A");
	}
	@AfterSuite
	public void logintohrm2()
	{
		System.out.println("After suite A");
	}
	
	
	
	
	@BeforeMethod
	public void logintohrm()
	{
		System.out.println("login to hrm by before method A ");
	}
	
	@AfterMethod
	public void logouttohrm()
	{
		System.out.println("login to hrm by after method A");
	}
	
	
	@Test
	public void loginhrm()
	{
		System.out.println("login to hrm");

		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login	
	}
	

		
}
