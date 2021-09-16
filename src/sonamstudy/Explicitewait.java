package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitewait {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
	/*	// element to be enable
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	WebDriverWait wait = new 	WebDriverWait(driver, 60);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	*/
		
	// visibility elements
	/*	WebDriverWait wait = new 	WebDriverWait(driver, 60);
		
	driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
	
	driver.findElement(By.xpath("//*[@id='hidden']"));
	
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='hidden']")));
	
	driver.findElement(By.xpath("//*[@id='hidden']"));
	*/
	// is alert

	/*	WebDriverWait wait = new 	WebDriverWait(driver, 30);
		
	    driver.findElement(By.xpath("//*[@id='alert']")).click();
	    wait.until(ExpectedConditions.alertIsPresent());
	
	
	    String alert1 = driver.switchTo().alert().getText();
	System.out.println(alert1);
	
	driver.switchTo().alert().accept();
	*/
	

		 WebDriverWait wait = new WebDriverWait(driver, 60);
			
		// driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	       	 
// wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//*[@id='populate-text']"), "Selenium Webdriver"));
	
	
 driver.findElement(By.xpath("//*[@id='checkbox']")).click();
 
 wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='checkbox']"), true));
 


	
	
	
	
	
	
}

}
