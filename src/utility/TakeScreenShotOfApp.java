package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfApp  
{
	public static void captureScreenShot(WebDriver driver, String filename) throws IOException
	
	{
		      
		TakesScreenshot	scrshot	= (TakesScreenshot)driver;
	
		 File source = scrshot.getScreenshotAs(OutputType.FILE);
		
	
	
	
	

	//File destination = new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot"+filename+".png");
  File destination = new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
	
	
//	File destination = new File("E:\\Desktop\\VimanNagar\\May 21\\KatrajSeleniumBasicMay21\\screenshots\\"+filename+".png");
	
	
	//File destination = new File(System.getProperty("user.dir")+"\\screenshots\\"+filename+".png");
	
	FileHandler.copy(source, destination);

		
	}

}




