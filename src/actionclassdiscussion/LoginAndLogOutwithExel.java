package actionclassdiscussion;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExelReaderWithReturnValue;
   
public class LoginAndLogOutwithExel {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		username.sendKeys(ExelReaderWithReturnValue.readData(0,0)); // username
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
	
driver.findElement(By.xpath("//*[@id='welcome']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Logout']")).click();  






}
}