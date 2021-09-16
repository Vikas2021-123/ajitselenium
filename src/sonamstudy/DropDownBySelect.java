package sonamstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect {
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/?rs=2&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI4Nzc1NDUyLCJjYWxsc2l0ZV9pZCI6Mzc4Mzc1MTU5OTY2NjIxfQ%3D%3D");

		WebElement days = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select s = new Select(days);
		
		s.selectByIndex(10);
		

		
		 // for counting days 
			
		WebElement months = driver.findElement(By.xpath("//*[@id='month']"));    

		Select s1 = new Select(months);
		s1.selectByIndex(6);
		//s1.selectByVisibleText("July");

		 // for counting days 
		List<WebElement> option1 = s1.getOptions();
			  int number2 = option1.size();
			 for(int i=0; i<number2; i++ )
			 {
				 String name1 = option.get(i).getText();
				 System.out.println("months");
				 System.out.println(name1);
			 }
			
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
      Select s2 = new Select(year);
      s2.selectByVisibleText("1993");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
