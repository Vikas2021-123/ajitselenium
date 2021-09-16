package sonamstudy;

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
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // 1st child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();// 2st child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();// 3st child window
		
		//parent id
		
		      String parent = driver.getWindowHandle();
		      
		      System.out.println( "parent id:"+parent);
		      
		     // multiple id
		      
		      Set<String> allwindow = driver.getWindowHandles();
		      
		      
		      
		      System.out.println("all window id:" +allwindow);
		     
		          int numofwindow = allwindow.size();
		      
		      System.out.println("number of window :"+ numofwindow );
		      

		    
		      for( String windowsid : allwindow)
		      {
		    if(!(parent.equals(windowsid)))
		    	
		    	driver.switchTo().window(windowsid);
		      }
		      
		      driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
		      
		      Thread.sleep(5000);
		      
		      driver.switchTo().window(parent);
		      
		      
		
}

}
