package actionclassdiscussion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggesionWithCowin
{
	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/");
	     WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
	     Actions a = new Actions(driver);
	     a.sendKeys(search, "cowin").perform();
	     Thread.sleep(2000);
	     
	     List<WebElement> search1 = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[3]/div[2]/ul/li[9]"));
	     
		 List<WebElement> auto = driver.findElements(By.xpath("//*[@class='erkvQe']"));
	   //*[text()=' manager']
	   //*[@jsname='erkvQe']//div//span
		
		 
		 //Actions a= new Actions(driver);
	   // auto.sendKeys(get.text());
		 
		 
	}
}
