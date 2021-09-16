package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgListner {

	static WebDriver driver;
	@Test(priority=1)
	public void loginToApp()
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		  driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
	    
		// child browser pop up
		driver.get("https://kite.zerodha.com/");   
		

		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DV2510");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Reset@123");
		

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		

		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("959594");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		  String url = driver.getCurrentUrl();
		  
		  boolean iscorrect = url.contains("dashboard");
		  
		  SoftAssert sa = new SoftAssert();
		  
		  sa.assertTrue(iscorrect);
		  
		  sa.assertAll();
		 
	}
	
	
	
	/*
@Test(dependsOnMethods=" loginToApp" , priority=2)
public void dashboard()
{System.out.println("dashboard ");
	}
	*/
	
}
		
		
		
		
		
		
		
		
		
		
		
