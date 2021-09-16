package testngdiscussion;

import org.testng.annotations.Test;

public class Testng {
	
	@Test(priority=2)
	 public void testCase1()
	 {
		System.out.println("test case1 from testing");
	 }

	@Test
	 public void testCase2()
	 {
		System.out.println("test case2 from testing");
	 }

	@Test
	 public void testCase3()          
	 {
		System.out.println("test case3 from testing");
	 }
	@Test
	 public void testCase4()
	 {
		System.out.println("test case4 from testing");
	 }
	

}
