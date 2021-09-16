package sonamstudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {


	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
	
	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // 1st child window
	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();// 2st child window
	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();// 3st child window
	
	       String parent = driver.getWindowHandle();
	
             Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	int number = all.size();
	System.out.println(number);
	
	for(String allid:all)
	{
		if(!(parent.equals(all)))
		{
			WebDriver allwindow = driver.switchTo().window(allid);
			
			driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
