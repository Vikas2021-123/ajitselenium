package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowss {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 
		      Set<String> allwindows = driver.getWindowHandles();
		      System.out.println(allwindows);
		      int numberofwindows = allwindows.size();
              System.out.println(numberofwindows);
              
              String s[] = new String [numberofwindows];
		      int i = 0;
		      for(String ids:allwindows)
		      {
		    	  s[i]=ids;
		    	  i++; 
		    	  
		      }
		      driver.switchTo().window(s[4]);
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
		      
		      Thread.sleep(3000);
driver.switchTo().window(s[0]); // parent window
		      driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		      driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		      driver.findElement(By.xpath("//*[@name='Submit']")).click();
		      
		      driver.quit();
		      
		      
		      
		      
		      
		      
		      
}
}
