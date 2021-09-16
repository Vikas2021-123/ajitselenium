package scrollingdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//**********scroll to perticular pixel ******//
	 
	//js.executeScript("window.scrollBy(0,800)");
	
	//Thread.sleep(2000);
	
	//js.executeScript("window.scrollBy(0,-600)");
	
	//**** scroll untill a webelement*******//
	
      WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_39']"));
	  //  js.executeScript("arguments[0].scrollIntoView();", checkbox);
	
	
	// **** click operation using javascript executor *****//
	
	js.executeScript("arguments[0].click();", checkbox);
	
	// sendkeys using javascript executor
	
	// WebElement textfield = driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']"));

	// js.executeScript("arguments[0].value= 'vikas';", textfield);
	
	
	
	
	

}
}
