package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildAlterPopup {
	
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
			driver.get("https://groww.in/mutual-funds");
			driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']")).click();
			driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("vikaspe01@gmail.com");
			
			
			
			
			
			
			
		     Thread.sleep(2000);
		driver.close();
	}

}
