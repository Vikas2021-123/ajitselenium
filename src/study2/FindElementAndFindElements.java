package study2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
//	************* by using findelements we locate only single webelment**************
	 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
     driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
      driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
      driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();

//    ********by using findelements we locate list of webelments (multiple webelement)***********
           
   List<WebElement> chechbox = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
     		
          for( WebElement check : chechbox)
         { 
        	  check.click();
        }
           int number = chechbox.size();
           System.out.println(number);
           
    /*  List<WebElement> checkbox = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
      
      for(WebElement check:checkbox)
    {
           check.click();
     }
      
//       ***** count the number of webelement ***********
      
       int number  = checkbox.size();
       
       System.out.println(number);
          
        
			
        	 
          */
       
}
}
