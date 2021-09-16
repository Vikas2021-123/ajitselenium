package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestClass1 {
	@Test
	
	

	public void loginToApp()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//Child browser popup
		driver.get("https://kite.zerodha.com/");
		

	
	
	
	
	
	}
}