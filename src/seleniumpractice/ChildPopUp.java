package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {
	
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
			
			driver.get("https://groww.in/mutual-funds");
	
         WebElement emailfill = driver.findElement(By.xpath("//*[@id='login_email1']"));
	
            emailfill.sendKeys("vikaspe01@gmail.com");
            
           // WebElement countinous = driver.findElement(By.xpath("//*[@id=\"lils382InitialLoginScreen\"]/div[4]/div[2]"));
            
            //countinous.click();
            
            driver.findElement(By.xpath("//*[@id=\"lils382InitialLoginScreen\"]/div[4]/div[2]/div")).click();
            
            driver.findElement(By.xpath("//*[@id='login_password1']")).sendKeys("1234");
            //*[@class='absolute-center btn51ParentDimension']
            
            
}

}
