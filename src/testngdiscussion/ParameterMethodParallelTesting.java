package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterMethodParallelTesting {

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
		
		@Parameters("browser")
		@Test
		public void browserSelection2(String browsername)
		{
			if(browsername.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver",
					"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
		}
		}
			@Parameters("browser")
			@Test
			public void browserSelection3(String browsername)
			{
				if(browsername.equalsIgnoreCase("chrome"))
				{
				System.setProperty("webdriver.chrome.driver",
						"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
			}
			


	
	}
	
	

}
