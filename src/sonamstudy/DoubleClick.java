package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {



public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
            driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

 
            Actions act = new Actions(driver);
            WebElement beforedoubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
           
            
            
            act.doubleClick(beforedoubleclick).perform();
            Thread.sleep(3000);
            
            String afteroperation = beforedoubleclick.getText();
            
            Thread.sleep(3000);
            
           
            System.out.println(afteroperation);
            
            driver.switchTo().alert().accept();
            
            
            
            
            
            
            
            
            
            
}
}
