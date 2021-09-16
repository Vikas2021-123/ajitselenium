package testngdiscussion;

import org.testng.annotations.Test;

public class DependMethodOnAnotherClassMethod {

	
	@Test(dependsOnMethods="testngdiscussion.MultipleDependentOnTestCase.login")
	public void holding()
	{
	System.out.println("holding method");	
	}
}
