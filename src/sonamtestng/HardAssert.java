package sonamtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {

	

	@Test
	public void loginapp()
	{
  
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username

		//driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin12345");//negative testcase
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
		
		String url = driver.getCurrentUrl();
	
		System.out.println(url);
		//***************Assert.assertEquals*************boolean method*********
		//boolean ispresent = url.contains("dashboard");
		
		//Assert.assertEquals(true, true);
		//**************string method***************
	Assert.assertEquals("abc", "abcd", "hi heloo");
		
	
	}
	//*********SECOND TEST CASE**************
		
	 @Test
	 public void user()
	 {
		System.out.println("before assertion"); 
		String actual = "login";
	 
	    Assert.assertEquals(actual, "logins");
	  
	    System.out.println("after assertion ");
	 }
	 
	 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

}
