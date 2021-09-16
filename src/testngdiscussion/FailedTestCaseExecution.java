package testngdiscussion;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExecution {

@Test
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Adminn"); // username
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); // password
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // login

driver.findElement(By.xpath("//*[@id='welcome']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Logout']")).click();  
}
@Test(dependsOnMethods="login")
public void testcase2()

{
	System.out.println("test case2");
}

@Test
public void Testcase3()
{
	
System.out.println("test case 3");

}
	
}
