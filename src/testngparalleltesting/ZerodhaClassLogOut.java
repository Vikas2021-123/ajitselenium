package testngparalleltesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ZerodhaClassLogOut extends ZerodhaClassLogin  {
    
	@Test
	public void zerodhalogout() throws InterruptedException
	{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='avatar-80']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("logout")).click();
		
		
	}
}
