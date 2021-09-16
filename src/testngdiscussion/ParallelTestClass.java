package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestClass {
	@Test(priority=1)

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
	}
	@Test(priority=2)
	public void logout()
	{

		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
        driver.findElement(By.xpath("//*[@id='welcome']")).click();

        driver.findElement(By.xpath("//*[text()='Logout']")).click();  

	
	}


}
	
	
