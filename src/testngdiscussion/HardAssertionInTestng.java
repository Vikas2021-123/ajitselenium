package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertionInTestng {
	 
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
		
		boolean ispresent = url.contains("dashboard");
		//****** boolean method*******
		 Assert.assertEquals(ispresent, true); // positive testcase // pass test case
		//Assert.assertEquals(ispresent, false);  // negative testcase  // pass test case
		 
	
		 
		 
		 
		 //******** String method *********
		 //Assert.assertEquals("abc", "abc"); // pass test case
		 
		 //********* String method with message*******
		 // meassege only will occure when test case is fail
		 
		 Assert.assertEquals(true, false, "test case output results");
	} 
		 
		 // second test case
		 
		 @Test
		 public void user()
		 {
			System.out.println("second test case"); 
			String actual = "login";
			
		    Assert.assertEquals(actual, "logins");
		  
		    System.out.println("after assertion ");
		 }
		 
		 @Test
		 public void testcase2()
		 {
			System.out.println("test case 2"); 
			Reporter.log("test case 2", true);
			
			Assert.assertTrue(true, "test case 2");
			
		 }
		 
		 @Test 
		 public void testcase3()
		 {
			 System.out.println("test case 3");
			 Reporter.log("test case 3", true);
			 
			 Assert.assertFalse(true, "test case 3");
		 }
	    
		 @Test 
		 public void testcase4()
		 {
			 System.out.println("test case 4");
			 Reporter.log("test case 4", true);
			 
			 Assert.assertNotEquals(45, 50);
		 }
	  
		 
	
	

}
