package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {


public static void main(String[] args) throws InterruptedException
{
		
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/");
		

		
		    WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));

		    search.sendKeys("india");
		    
		    
		    Actions a = new Actions(driver);
		    
      a.sendKeys(search ,Keys.ARROW_DOWN)
      .sendKeys(Keys.ARROW_DOWN)
      .sendKeys(Keys.ENTER).build().perform();
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
}
}