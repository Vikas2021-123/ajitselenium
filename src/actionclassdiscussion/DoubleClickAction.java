package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
            driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

            Actions act = new Actions(driver);

          WebElement beforedoubleclickk = driver.findElement(By.xpath("//*[@id='double-click']"));
          act.doubleClick(beforedoubleclickk).perform();
           String afterdoubleclick = beforedoubleclickk.getText();
    
          System.out.println(afterdoubleclick);
          driver.switchTo().alert().accept();
         //driver.switchTo().alert().accept(); //**** here we write got exception******//

}
}