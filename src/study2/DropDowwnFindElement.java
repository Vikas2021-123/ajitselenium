package study2;

import java.net.http.HttpResponse.BodySubscriber;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowwnFindElement {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/reg/?rs=2&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI4Nzc1NDUyLCJjYWxsc2l0ZV9pZCI6Mzc4Mzc1MTU5OTY2NjIxfQ%3D%3D");

	// for days selection by using findelements
	List<WebElement> daysvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
 
	for(WebElement days :daysvalues) 
	{
	String dayssoption = days.getText();
	
	if(dayssoption.equalsIgnoreCase("10"))
	{
		days.click();
		
		}
	System.out.print(dayssoption);
	}
	// for month selection by using findelements
	
	/*List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option "));
	for( WebElement monthvalue: months) 
	{
	String monthoption = monthvalue.getText();
	
	if(monthoption.equalsIgnoreCase("july")) 
	{ 
		monthvalue.click();
	}
	System.out.println(months); */
	
	// year selection
	
	  List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
	for(WebElement yearvalue : years)
	{
		String yearoption = yearvalue.getText();
		if(yearoption.equalsIgnoreCase("2020")) 
		{
			yearvalue.click();

	}	
		System.out.println(years);
	}
driver.close();
	
	
	
	
	
	
	}

	
}