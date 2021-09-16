package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassmodule2 {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite module2 ");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite module 2");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test module 2");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test module 2");
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
