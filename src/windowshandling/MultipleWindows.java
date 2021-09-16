package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
	    String parentid = driver.getWindowHandle();		
		
		System.out.println("parent windows id:" +parentid); //   printing father windowid
		
		Set<String> allwindow = driver.getWindowHandles(); // handles all 4 window
		
		        int numberofwindow = allwindow.size();
		      System.out.println(numberofwindow);  // counting no. of window
		      
		      String id []= new String[numberofwindow];
		      int i =0;
		      for(String ids : allwindow)
		      {
		    	  id[i]=ids;
		    	  i++;
		    	 
		    	  
		      }
		      driver.switchTo().window(id[2]); // switch to second window
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
		        
		      Thread.sleep(3000);
		      
		      driver.switchTo().window(parentid); // switch to parent windows
		      
		      driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		      driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		      driver.findElement(By.xpath("//*[@name='Submit']")).click();
		driver.quit();
		
		
	
}
}
