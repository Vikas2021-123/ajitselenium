package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class DropDownUsingSelectClass {
	


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.facebook.com/reg/?rs=2&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI4Nzc1NDUyLCJjYWxsc2l0ZV9pZCI6Mzc4Mzc1MTU5OTY2NjIxfQ%3D%3D");

			
			driver.manage().window().maximize();
			
			//driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("vikas");
			
			  
			 WebElement days = driver.findElement(By.xpath("//*[@id='day']")); // days values
			 Select sel = new Select(days);
			 sel.selectByIndex(10);
	
			 // for counting days 
		List<WebElement> option = sel.getOptions();
			  int number1 = option.size();
			 for(int i=0; i<number1; i++ )
			 {
				 String name = option.get(i).getText();
				 System.out.println(name);
			 }
			 
			 
			 WebElement month = driver.findElement(By.xpath("//*[@id='month']")); // month values
			 Select selmonth = new Select(month);
			 selmonth.selectByValue("11");
			 
			 
			 
			List<WebElement> option1 = selmonth.getOptions();
			int number = option1.size();
			
			for(int i=0; i<number; i++)
			{
				String options = option1.get(i).getText();
				
				System.out.println(options);
			}
			 
			 
			 
			 WebElement year = driver.findElement(By.xpath("//*[@id='year']")); // year values 
			 Select selyear = new Select(year);
			 selyear.selectByVisibleText("2020");
	
			 
			Thread.sleep(2000);
			driver.close();
			
			
	}

}
