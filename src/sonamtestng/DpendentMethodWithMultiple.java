package sonamtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DpendentMethodWithMultiple {
	
	@Test(priority=1)
	public void main()
	{
		System.out.println("main method");
	}

	
	@Test(priority=2 )
	public void login()
	{
		System.out.println("login ");
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUserbghjbghname']")).sendKeys("Addmin"); // username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
	
	}
	
	  
	
	@Test(priority=3, dependsOnMethods="login")
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	
		@Test(priority=4, dependsOnMethods="logout")
		public void admin()
		{
			System.out.println("admin");
			
		}
		
		
		@Test(priority=5)
		public void dashboard()
		{
			System.out.println("dashboard");
		}

	}


