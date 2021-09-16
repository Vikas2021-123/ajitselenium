package sonamtestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priority {
	

	
	@BeforeTest
	public void dashboard1()
	{
	
		System.out.println("before test");

		
	}
	
	@AfterTest
	public void dashboard2()
	{
		System.out.println("after test");
	}
	
	

	
	@AfterClass
	public void dashboard()
	{
		System.out.println("after class");
	}
	
		
	@BeforeMethod
	public void method()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void method1()
	{
		System.out.println("after method");
	}
	
	@Test
	public void admin()
	{
		System.out.println("test cases");
		}
	

	  
@BeforeSuite
public void main()
{
	System.out.println("before suite");
}

@AfterSuite
public void main2()
{
	System.out.println("after suite");
}

}







