package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownByUsingFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		driver.get("https://www.facebook.com/reg/?rs=2&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI4Nzc1NDUyLCJjYWxsc2l0ZV9pZCI6Mzc4Mzc1MTU5OTY2NjIxfQ%3D%3D");
		
          driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("vikas");
          
          driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("gupta");
          
          driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("8292129047");
          
          driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("vikaspe01!");
          
          WebElement day = driver.findElement(By.xpath("//*[@id='day']")); // only for single webelement 
          
          //for multiple web elements
          List<WebElement> daysvalue = driver.findElements(By.xpath("//*[@id='day']//option"));
            
	         for( WebElement days : daysvalue)
			{
			   	 String wholedays = days.getText();
			   	 
			   	 if(wholedays.equalsIgnoreCase("10"))
			   	 {
			   		 days.click();
			   	 }
		      
				System.out.println(wholedays);
			}
	         
	         
	         List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']/option[3]"));
	 /*  for ( WebElement onemonth:month)
	   {
		  String monthvalue = onemonth.getText();
		  
		  if(monthvalue.equalsIgnoreCase("feb"))
		   {
			 onemonth.click();
		   }
	   }*/
			
           
	        	 
	        	 List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		
		for( WebElement oneyears : years)
		{
			 String yearss = oneyears.getText();
			 
			 if(yearss.equalsIgnoreCase("2020"))
			 {
				 oneyears.click();
			 }
			 //System.out.println(yearss);
		}
			
	                 // driver.findElement(By.xpath("//*[text()='Female']")).click();
	                 // driver.findElement(By.xpath("//*[@id='u_3_2_ZS']")).click();
            	
          
          
          
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
