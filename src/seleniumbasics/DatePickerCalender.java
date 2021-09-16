package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerCalender {

		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); 
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login

    driver.findElement(By.xpath("//*[@id='menu_dashboard_index']")).click();
    driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click();
    driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveList']")).click();
    
    WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
     Select sel = new Select(month);
     sel.selectByVisibleText("Nov");  
     
    
    
    
    
    
    driver.close();
}
}