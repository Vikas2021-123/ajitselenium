package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "D:\\IMP FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C231327397082%7Ce%7Cfacebook%20english%7C&placement&creative=231327397082&keyword=facebook%20english&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006255091%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302991057522%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwqOr_vL_8QIViTArCh1Jwgo3EAAYASAAEgJp6vD_BwE");
		Actions acts = new Actions(driver);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("vikas");
		acts.sendKeys(Keys.TAB).sendKeys("gupta").sendKeys(Keys.TAB).sendKeys("12345678909")
		.sendKeys(Keys.TAB).sendKeys("Vikaspe01!").sendKeys(Keys.TAB).sendKeys("8")
		.sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("2020").build().perform();
	/*	
		//***************OR******************* WE CAN USED WITH WEB ELEMENT ALSO*****
		
		driver.findElement(By.xpath("//*[@id='day']//option[4]")).click();
		acts.sendKeys(Keys.TAB).sendKeys("10").build().perform();
		*/
		Thread.sleep(2000);
		driver.close();
	}
}
