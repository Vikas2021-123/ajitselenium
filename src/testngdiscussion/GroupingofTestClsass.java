package testngdiscussion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingofTestClsass {
	
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("opening the browser");
		
	}

	@Test(groups= "sanity")
	public void navToApp()  
	{
		System.out.println("navigation to app");
	}
	
	@Test(groups= {"sanity", "regression","functional"})
	public void login()
	{
		System.out.println("login to app");
	}
	
	@Test(groups="regression")
	public void dashboatd()
	{
		System.out.println("dashboatd");
		
	}
		@Test(groups = "functional")
		public void buy()
		{
			System.out.println("buying of shares");
		}
		
		@Test(groups="functional")
		public void profile()
		{
			System.out.println("profile");
			
		}
		
		@Test(groups="sanity")
		public void logout()
		{
			System.out.println("logout");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	