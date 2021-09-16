package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

@Test
	public void loginToApp()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//Child browser popup  
		driver.get("https://kite.zerodha.com/");
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	String text = driver.findElement(By.xpath("//*[@class='form-header text-center']//h2[text()='Login to Kite']")).getText();
		
		SoftAssert sa = new SoftAssert();
		
		//boolean ispresent = text.contains("Login");
		//sa.assertEquals(ispresent, false);
		
		
		//Assert.assertEquals(ispresent, false);
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Reset@123");
		

	 	driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("959594");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//String url = driver.getCurrentUrl();
		
		//boolean iscorrect = url.contains("dashboard");
		
		
		//sa.assertTrue(iscorrect);
		
		sa.assertAll();
	}



}
