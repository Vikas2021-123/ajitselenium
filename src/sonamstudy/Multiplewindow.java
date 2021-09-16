package sonamstudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {


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
		
		     //String parent = driver.getWindowHandle();
		//System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println("window id:"+ allwindow);
		
		     int numofwindow = allwindow.size();
		
		System.out.println("all window is :"+ numofwindow);
		
		String s[]= new String  [numofwindow];
		
		int i =0;
		 
	      for(String ids : allwindow)
	      {
	    	  s [i]=ids;
	    	  i++;
	      }
	      
	    driver.switchTo().window(s[3]); 
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
	    Thread.sleep(5000);
	    
	    driver.switchTo().window(s[0]);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	      driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	      driver.findElement(By.xpath("//*[@name='Submit']")).click();
	      
	      driver.switchTo().window(s[1]);
	      driver.switchTo().window(s[2]);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}		
}
