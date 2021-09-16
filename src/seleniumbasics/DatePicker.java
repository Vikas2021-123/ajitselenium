package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin"); // username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login
		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click(); // leave option
		driver.findElement(By.xpath("//*[@id='calFromDate']")).click(); // from option // from option 
	    driver.findElement(By.xpath("//*[text()='12']")).click(); //  choose from date calender
	    driver.findElement(By.xpath("//*[@id='calToDate']")).click(); // to option
	    driver.findElement(By.xpath("//*[text()='20']")).click(); // choose  to date from to calender
	    
	   // Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_1']")).click();// click to pending option
	    driver.findElement(By.xpath("//*[@id='leaveList_txtEmployee_empName']")).sendKeys("vikas"); // employee name
	    driver.findElement(By.xpath("//*[@id='leaveList_cmbSubunit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='leaveList_cmbSubunit']/option[3]")).click();// second option selected
	    driver.findElement(By.xpath("//*[@id='leaveList_cmbWithTerminated']")).click();
	    driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_-1']")).click();
	    driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
	    Thread.sleep(5000);
	    driver.close();
	
	}

}
