package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

//*********** ALERT***************
     WebElement alert = driver.findElement(By.xpath("//*[@name='alert']"));
    alert.click();
     
    Thread.sleep(5000);
     String alertonmessage = driver.switchTo().alert().getText();
      
     System.out.println(alertonmessage);
     
     driver.switchTo().alert().accept();
     
     //************alert with ok and cancel***********
     
      
      driver.findElement(By.xpath("//*[@name='confirmation']")).click();
      
      Thread.sleep(5000);
      String alertaccept = driver.switchTo().alert().getText();
      
      System.out.println(alertaccept);
      
      //driver.switchTo().alert().accept();
      
      driver.switchTo().alert().dismiss();
      
      //********* file upload**********
      driver.findElement(By.xpath("//*[@name='upload']")).sendKeys("\"D:\\MOLU\\60b12058-992c-48d4-a8ee-c46cffdb9e99.jfif\"");
      
      
      driver.close();
      
	}
}
