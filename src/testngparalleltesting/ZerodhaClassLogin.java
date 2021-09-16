package testngparalleltesting;



import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class ZerodhaClassLogin 
	{
		static WebDriver driver;
	@Test
		public void loginToApp() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\IMP FILE\\chromedriver.exe");

	          driver = new ChromeDriver();

			driver.manage().window().maximize();

	    driver.get("https://kite.zerodha.com/");
			
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
			
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
			//Thread.sleep(2000);

		 	driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("992101");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			
		
		



	}

}