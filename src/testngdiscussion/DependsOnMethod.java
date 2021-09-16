package testngdiscussion;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;





public class DependsOnMethod {
	
	@Test(priority=1)  
	public void login()
	{
		System.out.println("login method");
	Assert.fail();
	}
	
	@Test(priority=2, dependsOnMethods="login")
public void dashboard()
{
	System.out.println("dashboard");
	}

@Test(priority=3)
public void profile()
{
System.out.println("profile");	
}
}
