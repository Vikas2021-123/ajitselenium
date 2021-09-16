package waitinselenium;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImpliciteWait {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	  	  
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); // usually not used
		driver.get("https://www.google.com/");
  
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    
   WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
    search.sendKeys("india");
       
    
    Actions acts = new Actions(driver);
    
    acts.sendKeys(search, Keys.ENTER).build().perform();
    
    driver.findElement(By.xpath("//*[text()='Sbi.co.in']")).click();
	
    driver.close();
    
    
}
}