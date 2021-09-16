package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
	    driver.get("https://jqueryui.com/slider/");
	    
	   WebElement subframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	    // switch main frame to subframe
	    driver.switchTo().frame(subframe);
	   
	  WebElement slidder = driver.findElement(By.xpath("//*[@id='slider']"));
	    Actions a = new Actions(driver);
	    a.clickAndHold(slidder).moveByOffset(400, 0).moveByOffset(-300, 0).build().perform();
	    
	    
	}
}
