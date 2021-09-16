package sonamstudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowbyMe {
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // parent window
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click(); // child window
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		String parent = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println(allwindow);
		        int numberofwindow = allwindow.size();
		
		System.out.println(numberofwindow);
		
		String s[] = new String [numberofwindow];
		
		int i=0;
		
		for(String ids:allwindow)
		{
			s[i]=ids;
			i++;
		}
		driver.switchTo().window(s[2]);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
        Thread.sleep(2000);
        
     driver.switchTo().window(s[0]);
     
		Thread.sleep(3000);
		
		driver.switchTo().window(s[4]);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='home-tril-email-btn']")).click();
        
		Thread.sleep(1000);
		
		driver.switchTo().window(s[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}