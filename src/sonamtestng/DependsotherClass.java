package sonamtestng;

import org.testng.annotations.Test;

public class DependsotherClass {

	@Test(dependsOnMethods="sonamtestng.DpendentMethodWithMultiple.login")
	public void show()
	{
		System.out.println("show test case");
	}

}