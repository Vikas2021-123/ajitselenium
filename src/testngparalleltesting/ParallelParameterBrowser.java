package testngparalleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class 	ParallelParameterBrowser {
	
	WebDriver driver;

	@Parameters("browser")

	@Test
	
	public void chromeBrowser(String nameofbrowser)
	{
		if(nameofbrowser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

	 driver = new ChromeDriver();
		}
		
		else if (nameofbrowser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver",
					"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

			 driver = new ChromeDriver();
			
		}   
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		boolean isdisplay = username.isDisplayed();

		System.out.println("displaying username retuns :" + isdisplay);

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
}

