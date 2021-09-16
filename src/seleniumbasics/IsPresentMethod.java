package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsPresentMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
          //driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
//		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
//		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
//		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
//		
//	 	//*********** is selected method ***************
//		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_39']"));
//		boolean isselected = checkbox.isSelected();
//		System.out.println("before click:"+ isselected);
//		checkbox.click();
//		 
//		 boolean afterclick = checkbox.isSelected();
//		
//		System.out.println("after click:" + afterclick);
//		
		//********** is displayed ****************
          
//          WebElement hidden = driver.findElement(By.xpath("//*[@type='hidden']"));
//          boolean beforecheck = hidden.isDisplayed();
//          System.out.println(beforecheck);
//          WebElement nothidden = driver.findElement(By.xpath("//*[@id='txtUsername']")); 
//	      boolean aftercheck = nothidden.isDisplayed();
//          System.out.println(aftercheck);
//    
      
           // ***********is enabled ***************
    
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    WebElement disable = driver.findElement(By.xpath("//*[@id='disable']"));
  boolean beforetime = disable.isEnabled();
    System.out.println(beforetime);
    WebElement aftertime = driver.findElement(By.xpath("//*[@id='enable-button']"));
    
    aftertime.click();
    Thread.sleep(12000);
    boolean afterclick = aftertime.isEnabled();
    System.out.println(afterclick);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}