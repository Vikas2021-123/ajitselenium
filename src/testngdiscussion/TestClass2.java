package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	
	
	
	
	@Test
	public void login2()
	{
		System.out.println("login2 from test class2");
		Reporter.log("login method", true);
	}
	
	@Test
	public void dashboard2()
	{
		System.out.println("dashboard2 from test class2");
		Reporter.log("dashboard method", true);
	}

}
