package study2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowmBySelectClass
 {
	
public static void main(String[] args) throws InterruptedException 
{
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/reg/?rs=2&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI4Nzc1NDUyLCJjYWxsc2l0ZV9pZCI6Mzc4Mzc1MTU5OTY2NjIxfQ%3D%3D");

	WebElement days = driver.findElement(By.xpath("//*[@id='day']"));
	Select sel = new Select(days);
	sel.selectByVisibleText("10");
	
	WebElement months = driver.findElement(By.xpath("//*[@id='month']"));
	
	Select sel1= new Select(months);
	//sel1.deselectByVisibleText("10");
	sel1.selectByIndex(10);
	//sel1.deselectByValue("7");
	
	WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
	
	Select sel2 = new Select(year);
	//sel2.selectByIndex(2020);
	sel2.selectByVisibleText("2020");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}