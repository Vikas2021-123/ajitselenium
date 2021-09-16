package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingbyme {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	
		    String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		   Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println(allwindow);
		
		    int numofwindow = allwindow.size();
		
		    for(  String allwindowsid :allwindow) 
		    {
		    	System.out.println(allwindowsid);
		    	
		    	if(!(parent.equals(allwindowsid)))
		    	{
		    	
		    	driver.switchTo().window(allwindowsid);
		   
		    	 driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
		    	 	Thread.sleep(2000);	 
		    }
		
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
