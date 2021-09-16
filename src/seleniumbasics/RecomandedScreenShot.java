package seleniumbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.TakeScreenShotOfApp;

public class RecomandedScreenShot {

public static void main(String[] args) throws IOException 
{
		
		System.setProperty("webdriver.chrome.driver","D:\\IMP FILE\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		// alert popup with ok
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.findElement(By.xpath("//*[@name='alert']")).click();
	driver.switchTo().alert().accept();
	
	TakeScreenShotOfApp.captureScreenShot(driver, "screenshotvikas");

}
}