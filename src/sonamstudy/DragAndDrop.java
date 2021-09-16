package sonamstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
        driver.get("https://jqueryui.com/droppable/");
        
        // switch main fram to subfram
        
        WebElement subfram = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        
        driver.switchTo().frame(subfram);
        
       WebElement dragable = driver.findElement(By.xpath("//*[@id='draggable']"));
     WebElement dropable = driver.findElement(By.xpath("//*[@id='droppable']"));
       
       
       
       Actions a = new Actions(driver);
       
       Thread.sleep(3000);
       a.dragAndDrop(dragable, dropable).build().perform();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

} 
}