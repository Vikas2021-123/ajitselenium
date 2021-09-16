package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTestng {
	
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void browserSelection(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			}
		
		
		
		else if(browsername.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver" , "D:\\IMP FILE\\geckodriver.exe");
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
				
		}
		
	}

	@Parameters({"environment", "version"})
	@Test
	public void buildInfo(String env, String version)
	{
		System.out.println("the enviornment used is : "+env);
		System.out.println("The version of build is :"+version);
		
		//driver.get("https://kite."+env+"zerodha.com/");
	}

}
