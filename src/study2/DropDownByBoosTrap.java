package study2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownByBoosTrap {


public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://zoom.us/signup");
	
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//*[@id='select-1']")).click();

}
}

