package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
        driver.get("https://jqueryui.com/droppable/");
        
       WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        // switch into the frame
        driver.switchTo().frame(frame);
        WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
        
        WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions acts = new Actions(driver);
        acts.dragAndDrop(draggable, droppable).perform();
        // switch out from the frame
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//*[text()='Slider']")).click();
	}

}
