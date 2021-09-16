package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



public class TestCase{
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class method");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	 
	@Test(priority=2)
	public void login()
	{
		System.out.println("test case1 from test case class");
		Reporter.log("login method", true);
	}
	  
	
	@Test(priority=3)
	public void dashboard()
	{
		System.out.println("test case2 from test case class");
			Reporter.log("dashboard method", true);
	}
	
	@Test(priority=1)
	public void admin()
	{
		System.out.println("test case3 from test case class");
		Reporter.log("admin method", true);
		
	}
	
}
