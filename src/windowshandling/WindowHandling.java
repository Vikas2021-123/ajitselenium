package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
	 String parentid = driver.getWindowHandle();		
		
		System.out.println("parent windows id:" +parentid);
		
		

		
		Set<String> allwindows = driver.getWindowHandles();    
		
	              int numberofwindow = allwindows.size();
System.out.println(" total number of window: " + numberofwindow);
	        	 
	        	 for( String windowid : allwindows)
	        	 {
	        		 System.out.println(windowid);
	        		 
	        		 if(!(parentid.equals(windowid)))
	        		 {
	        			 driver.switchTo().window(windowid);
	        			 driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
	        			 
	        			 Thread.sleep(2000);
	        			 driver.switchTo().window(parentid);
	        		 }
	        		 
	        	 }
	        	 
	    
		
		
		
		
		
		
		
		
	}

}
