package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SonamlistenerScreenshot {

	public static void captureScreenShotSonam(WebDriver driver, String filename) throws IOException
	
	{
		
		TakesScreenshot	scrshot	= (TakesScreenshot)driver;
	
		 File source = scrshot.getScreenshotAs(OutputType.FILE);
		 File destination = new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
		 FileHandler.copy(source, destination);



	}
}
