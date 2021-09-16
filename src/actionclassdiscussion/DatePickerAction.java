package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerAction {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
		    driver.get("https://jqueryui.com/datepicker/");
		    WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		    driver.switchTo().frame(frame);
		    
		    driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		    while(true)
		    {
		String title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		 
		  System.out.println(title);
		    
		   if(title.equals("june 2020"))
		   {
			   driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		   }
		   else
		   {
			   break;
		   }
		   }
		    int date=9;
		    driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-active']")).click();
		  
		    
		    
	}
}
