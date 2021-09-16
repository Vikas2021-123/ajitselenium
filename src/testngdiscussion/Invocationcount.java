package testngdiscussion;

import org.testng.annotations.Test;

public class Invocationcount {
	
	@Test(invocationCount=5)
	public void login()
	{    
		System.out.println("login method");
	}
	@Test(enabled=false)
	public void dashboard()
	{
		System.out.println("dashboard method");
	}
	
	

}
