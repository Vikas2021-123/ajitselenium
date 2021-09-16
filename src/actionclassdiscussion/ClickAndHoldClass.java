package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize(); 
    driver.get("https://jqueryui.com/slider/");
    
    WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
    // switch into the frame
    driver.switchTo().frame(frame);
    WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
    
    Actions acts = new Actions(driver);
   acts.clickAndHold(slider).moveByOffset(80, 0).moveByOffset(-70, 0).release().build().perform();
}
}
