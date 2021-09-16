package testngparalleltesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHrmAdmin extends LoginHrm {
   
	@Test
	public void admin()
	{
	driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click(); // leave option
	driver.findElement(By.xpath("//*[@id='calFromDate']")).click(); // from option // from option 
    driver.findElement(By.xpath("//*[text()='12']")).click(); //  choose fr
}
}