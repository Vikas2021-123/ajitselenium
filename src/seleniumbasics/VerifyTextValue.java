package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextValue {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		
		//CONDITION:-1.   without username and  without password
	/* String messagetext = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		System.out.println(messagetext);
		
		if(messagetext.equals("Username cannot be empty"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}*/
		
		// CONDITION :=2.with only username and without password
	
	  /* driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	   String messagetext1 = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		System.out.println(messagetext1);
		if(messagetext1.equals("Password cannot be empty"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail"); 
		}*/
		
		//  CONDITION :-3. without username and with password
	/*	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		 String messagetext2 = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		 System.out.println(messagetext2);
		 
		 if(messagetext2.equals("Username cannot be empty"))
			 
		 {
			 System.out.println("pass");
			 }
		 else {
			 System.out.println("fail");
		 }*/
		
	    // CONDITION :-4. wrong username and wrong password
		 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admincf");
		 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123v");
		 driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		 String messagetext3   = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		
		System.out.println(messagetext3);
		if(messagetext3.equals("Invalid credentials"))
		{
			
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
		
		
		
		driver.close();
		Thread.sleep(2000);
	}

}
