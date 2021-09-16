package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.TakeScreenShotOfApp;
public class ScreenShot {
public static void main(String[] args) throws IOException 
{
		
		System.setProperty("webdriver.chrome.driver","D:\\IMP FILE\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// alert popup with ok
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	      driver.findElement(By.xpath("//*[@name='alert']")).click();
		driver.switchTo().alert().accept();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.xpath("//*[@id='btnLogin']"));
		
	   TakesScreenshot scrshot = (TakesScreenshot)driver;
	    
	   File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	
	File destinarion = new File("C:\\Users\\User\\Desktop\\screenshot.png");
	
	
  FileHandler.copy(source, destinarion);
	
	 
	
	
	
	
	
	
	
	
}
}