package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependentOnTestCase {

	
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
@Test(dependsOnMethods= {"login", "dashboard"})
public void admin()
{
	System.out.println("login");
}
}




