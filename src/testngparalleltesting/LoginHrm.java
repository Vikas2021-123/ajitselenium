package testngparalleltesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHrm {
 static WebDriver driver;
	@Test
	public void hrm()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
//	************* by using findelements we locate only single webelment**************
	 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
     driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
      driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
      driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();

//    ********by using findelements we locate list of webelments (multiple webelement)***********
          List<WebElement> checkbox = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
      
}
}
