package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementHover {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // loginn
	Actions act = new Actions(driver);
	WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
   // act.moveToElement(admin).perform();
    WebElement usermngt = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
   WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
act.moveToElement(admin).moveToElement(usermngt).moveToElement(user).build().perform();

//***right click with the help of action class*****//

WebElement maintainance = driver.findElement(By.xpath("//*[@id='menu_maintenance_purgeEmployee']"));
 act.moveToElement(maintainance).contextClick().build().perform();



Thread.sleep(5000);
driver.close();

}
}
