package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverconfiguration {
	
	 static WebDriver driver;
	 
	static String browser = "Firefox";
	
public static void main(String[] args) {
//		if(browser.equals("Chrome"))
//		{
//		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
//		
//
//		 driver = new ChromeDriver();
//		}
//		
	if(browser.equals("Firefox"))
	{
			System.setProperty("webdriver.gecko.driver", "D:\\IMP FILE\\Firefox Installer (1).exe");
		 driver = new FirefoxDriver();
		
		
		
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}

}
