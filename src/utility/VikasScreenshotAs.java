package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class VikasScreenshotAs {
	

public static void screenbyvikas(WebDriver driver, String filename) throws IOException 
{
		

	   TakesScreenshot scrshot = (TakesScreenshot)driver;
	    
	   File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	
	//File destinarion = new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\screenshotbyme\\sonam.png");
	
	  File destination = new File (System.getProperty("user.dir")+"\\screenshotbyme\\"+filename+".png");
	
  FileHandler.copy(source, destination);
	


}
}