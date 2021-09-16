package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
	    	
		ChromeDriver driver=new ChromeDriver();
		
	driver.manage().window().maximize();
		
        driver.get("https://opensource-demo.orangehrmlive.com/");
	
	 //driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		
	//driver.findElement(By.xpath("//*[contains(text(), 'Forgot your password?')]")).click(); 
	
		
		
		
		
		
	}
}
