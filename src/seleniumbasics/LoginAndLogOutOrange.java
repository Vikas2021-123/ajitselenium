package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogOutOrange { 
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
	
driver.findElement(By.xpath("//*[@id='welcome']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Logout']")).click();  






}
}