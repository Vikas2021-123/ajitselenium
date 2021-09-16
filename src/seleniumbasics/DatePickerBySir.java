package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerBySir {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
driver.get("https://jqueryui.com/dateoicker/");

  WebElement frame = driver.findElement(By.xpath("//*//*[@class='demo-frame']"));
  
  driver.switchTo().frame(frame);
  
      WebElement datepicker = driver.findElement(By.xpath("//*[@id='datepicker']"));
      
      JavascriptExecutor js =  (JavascriptExecutor)driver;
      
      js.executeScript("arguments[0].scrollingIntoView;", datepicker);
      
      driver.findElement(By.xpath("//*[@id='datepicker']")).click();
      
      while(true)
      {
    	  String title= driver.findElement(By.xpath("//*[class='ui-datepicker-title']")).getText();
    	  
    	  System.out.println(title);
    	  
    	  
    	  if(!(title.equals("July2020")))
    	  {
    		  driver.findElement(By.xpath("//*[@class='ui-iconui-icon-circle-triangle-w']")).click();
    		  
    	  }
    	  else
    	  {
    		  break;
    	  }
      }
      int date=9;
      
      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//tbody//tr//td//a[text()="+date+"]")).click();      
      
  
  
  
	}

}
