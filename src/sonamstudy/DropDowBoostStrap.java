package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowBoostStrap {
	


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signup");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='select-0']"));// month
		day.click();
		driver.findElement(By.xpath("//*[@id='select-item-select-0-3']")).click();//  perticular month
		
		driver.findElement(By.xpath("//*[@id='select-1']")).click(); // day
		
		driver.findElement(By.xpath("//*[@id='select-item-select-1-5']")).click(); // perticular date
		
		driver.findElement(By.xpath("//*[@id='select-2']")).click(); // year
		
		driver.findElement(By.xpath("//*[@id='select-item-select-2-99']")).click(); // perticular year
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

}