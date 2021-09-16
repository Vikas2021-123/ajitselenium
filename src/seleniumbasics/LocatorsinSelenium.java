package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsinSelenium 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//******* BY USING IS LOCATOR FOR USERNAME*********
//      WebElement username = driver.findElement(By.id("txtUsername"));
//	  username.sendKeys("Admin ");
	 
       //************	 BY USING ID LOCATOR FOR PASSWORD ***************  
//	 WebElement password=driver.findElement(By.id("txtPassword"));
//	  password.sendKeys("admin123 ");
	 
     // *********** BY USING ID LOCATOR FOR LOGIN BUTTON ************* 	  
//	 WebElement loginbutton = driver.findElement(By.id("btnLogin"));
//	 loginbutton.click();
		
		// ******** name LOCATOR classname LOCATOR***********
		/*WebElement username=driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin ");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123 ");
		
		WebElement loginbutton=driver.findElement(By.name("button"));
		loginbutton.click(); */
	 
	 
		//  **************BY USING linktext LOCATOR**************** 
	   //	WebElement forgotpswd=driver.findElement(By.linkText("Forgot your password?"));
		//forgotpswd.click();
		
		
		// ************ BY USING partial link text************* 
		
		//WebElement forgotpwd=driver.findElement(By.partialLinkText("password?"));
		//forgotpwd.sendKeys();
	                                // OR   //
		//driver.findElement(By.partialLinkText("Forgot your password?")).click();
		
	 
	     // ***********xPATH *****************
		//WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//username.sendKeys("Admin");
		
		//************ BY USING XPATH WITH TAGNAME***************
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 
		 // **************BY USING xPATH FOR ADMIN 
		 driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']  ")).click();
		 
		 
		 // **************BY USING xPATH  WITH TAGNAME FOR SINGLE CHECKLIST *************
		 //driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).click();
		 // driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_39']")).click();
		 
		 // tagname replace by *
        //	************SINGLE CHECK LIST ***************** 	 
       //driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_10']")).click(); 
		//driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_39']")).click();
		 
      //*********** BY USING CONTAINS TO SINGLE CHECKLIST
		 // driver.findElement(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]");
		 
		 
		 
		// driver.findElement(By.xpath("(//*[contains (@id,'ohrmList_chkSelectRecord_')])[10]")).click();
		 
		 // *************CLICKING ALL BY USING FOR LOOP*********************
		 for(int i=1; i<=37; i++)
		{
		driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		
		}
		
		
		//******************* CHECKING ODD CHECKLIST ONLY *****************
		/*for(int i=1; i<=37; i++)
		 {
			 
	driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+2*i+"]")).click();
			 }
		 
		/*for(int i=1; i<=37; i++)
		 {
			 
	driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+1*i+"]")).click();
			 }*/
		 
				
		 
		 // *****BY USING TEST() FUNCTION*****
		 
		// driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		 
		 
		 // ********TEST() FUNCTION WITH CONTAINS************
		// driver.findElement(By.xpath("//*[contains(text(), 'Forgot your password?')]")).click();
		 
		 
		 //************** RELATIVE PATH ****************
		 //driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_10']")).click();
		 //driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_22']")).click();
		 
		 
		 //*********************RELATIVE PATH BY USING CONTAINS*******************
		 //driver.findElement(By.xpath("//*[contains(@id, 'ohrmList_chkSelectRecord_26')]")).click();
		 
		 //*********************ABSOLUTE PATH BY USING CONTAINS*******************
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td[1]/input")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[7]/td[1]/input")).click(); 
				
		  // ************RELATIVES PATH:- starts-with***************
          //driver.findElement(By.xpath("//*[starts-with(@id, 'txtU')]")).sendKeys("Admin");
		 
		// ***********RELATIVE xPATH BY USING OPERATOR*****************
		driver.findElement(By.xpath("//*[@name='txtUsername'and @id='txtUsername']")).sendKeys("Admin"); 
		driver.findElement(By.xpath("//*[@name='txtPassword' or @id='abcdef']")).sendKeys("admin123");
		
		Thread.sleep(5500);  
		driver.close();
		
		
		 
	}
		
	} 


