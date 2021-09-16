package sonamtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Failedtest {
@Test
public void fail()
{
	
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsehjggjgjrname']")).sendKeys("Aadmin"); // username
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login

	
	
	}

@Test(dependsOnMethods="fail")
public void logout()
{
	System.out.println("logout");
	}
@Test
public void dashboard()
{
	System.out.println("dashboard");}
}
