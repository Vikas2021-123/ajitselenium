package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListenerTestng {
	static WebDriver driver;
@Test
public void sonam()
{
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin1123"); // password
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login


}

}
