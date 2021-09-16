package study2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList/reset/1");
		
		driver.manage().window().maximize();
		
		// locator by id
driver.findElement(By.id("txtUsername")).sendKeys("Admin"); // 1st way
//		WebElement username = driver.findElement(By.id("txtUsername")); // 2nd way
		
//     username.sendKeys("Admin");
		
// locator by name
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");

// locator by classname

     driver.findElement(By.className("button")).click();
		
		// locator by linktext
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		// locator by partial link text
		//driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("Forgot ")).click();
		
     
     // locator by xpath
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		//driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_39']")).click();
		// for multiple check boxes
		
	//List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id, 'ohrmList_chkSelectRecord_')]"));
	/*	for( checkofboxes : chechboxes)
		{
			
		}
		
		/*for(int i=1; i<=37; i++)
		{
			driver.findElement(By.xpath("(//*[contains(@id, 'ohrmList_chkSelectRecord_')])["+i+"]")).click();
			
		} */
		
		//******************* CHECKING EVEN CHECKLIST ONLY *****************
				for(int i=1; i<=37; i++)
				 {
					 
			driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[(2*i)-1]")).click();
					
				 }
				 
				 
				  
				 
				 
				 
				 
				 
				 
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				 //*********************RELATIVE PATH BY USING CONTAINS*******************
				 //driver.findElement(By.xpath("//*[contains(@id, 'ohrmList_chkSelectRecord_26')]")).click();
				 
				 //*********************ABSOLUTE PATH BY USING CONTAINS*******************
				//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td[1]/input")).click();
				//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[7]/td[1]/input")).click(); 
						
				  // ************RELATIVES PATH:- starts-with***************
		          //driver.findElement(By.xpath("//*[starts-with(@id, 'txtU')]")).sendKeys("Admin");
				 
				// ***********RELATIVE xPATH BY USING OPERATOR*****************
				//driver.findElement(By.xpath("//*[@name='txtUsername'and @id='txtUsername']")).sendKeys("Admin"); 
			//	driver.findElement(By.xpath("//*[@name='txtPassword' or @id='abcdef']")).sendKeys("admin123");
				
				
	}
}

