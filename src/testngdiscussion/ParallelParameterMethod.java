package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelParameterMethod {

	@Parameters("browser")

	@Test
	public void browserselection(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
			driver.get("https://www.google.com/");
	    }
	}
		



}

