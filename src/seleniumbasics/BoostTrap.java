package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostTrap {
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://zoom.us/signup");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='select-0']")).click(); //for month
	
	
	
	driver.findElement(By.xpath("//*[@id='select-item-select-0-5']")).click(); // choose month option
	 
	
	driver.findElement(By.xpath("//*[@id='select-1']")).click();   // for date 
	driver.findElement(By.xpath("//*[@id='select-item-select-1-2']")).click(); // choose date
	
	
	driver.findElement(By.xpath("//*[@id='select-2']")).click(); // for year
	driver.findElement(By.xpath("//*[@id='select-item-select-2-96']")).click();
	driver.findElement(By.xpath("//*[@class='continue_button zm-button--primary zm-button--large zm-button']")).click();
	
	
	
	
	
}
	
}
 