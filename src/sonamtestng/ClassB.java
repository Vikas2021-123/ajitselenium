package sonamtestng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {
	
	
	@BeforeSuite
	public void logintohrm3()
	{
		System.out.println(" before suite B");
	}
	@AfterSuite
	public void logintohrm4()
	{
		System.out.println("After suite B");
	}
	
	
	

	@BeforeTest
	public void logintofacebook1()
	{
		System.out.println("login to facebook before test");
	}
	

	@AfterTest
	public void logintofacebook2()
	{
		System.out.println("login to facebook After test ");
	}
	
	
	
	
	
	
	
	@BeforeClass
	public void logintofacebook()
	{
		System.out.println("login to facebook before class");
	}
	
	@AfterClass
	public void logouttofacebook()
	{
		System.out.println("login to facebook After class");
	}
	
	@Test
	public void loginfacebook()
	{
		System.out.println("login to facebook");
		
		
	}
	
	@Test
	public void logoutfacebook()
	{
		System.out.println("logout to facebook");
		
	}
	
}
