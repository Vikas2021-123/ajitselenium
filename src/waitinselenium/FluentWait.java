package waitinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(40, TimeUnit.SECONDS)
				.pollingevery(10, TimeUnit.MICROSECONDS);
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']"));
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		
		

}
}
