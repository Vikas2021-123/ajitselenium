package waitinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteFlipcart {  

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");

WebDriverWait wait = new WebDriverWait(driver, 90);

driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();


//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='_1bEAQy _2iN8uD'])[4]")));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[3]/div/a/div/img[2]"))).click();
}
}
