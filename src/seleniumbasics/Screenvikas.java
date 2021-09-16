package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenvikas {

public static void main(String[] args) throws IOException 
{
		
		System.setProperty("webdriver.chrome.driver","D:\\IMP FILE\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// alert popup with ok
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	      //driver.findElement(By.xpath("//*[@name='alert']")).click();
		//driver.switchTo().alert().accept();
		
	   TakesScreenshot scrshot = (TakesScreenshot)driver;
	    
	   File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	
	File destinarion = new File("C:\\Users\\User\\Desktop\\sonamscreen\\vikas.png");
	
	
  FileHandler.copy(source, destinarion);
	


}
}