package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopHandling
{
	
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");


//************ alert with ok *******************
driver.findElement(By.xpath("//*[@name='alert']")).click();
    String textonalert = driver.switchTo().alert().getText();

System.out.println("String on alert is:"+ textonalert);

driver.switchTo().alert().accept();


  
//**************** alert with ok and cancel*************

driver.findElement(By.xpath("//*[@name='confirmation']")).click();
 String  confirmationalerttext = driver.switchTo().alert().getText();
 
 System.out.println("confirmation:" + confirmationalerttext);
 
 //driver.switchTo().alert().accept(); //  clicking on ok button
 driver.switchTo().alert().dismiss(); // clicking on cancel button
 
 // *****************  file uploading *********************
 driver.findElement(By.xpath("//*[@name='upload']")).sendKeys("\"D:\\MOLU\\pp.jfif\"");
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 Thread.sleep(2000);
 
 
 
}
}