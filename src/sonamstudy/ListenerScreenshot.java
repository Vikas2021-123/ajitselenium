package sonamstudy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import seleniumbasics.LoginAndLogOutOrange;
import utility.TakeScreenShotOfApp;

public class ListenerScreenshot extends ListenerTestng implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("on set start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("success");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("fail");
		try {
			TakeScreenShotOfApp.captureScreenShot(driver, result.getName() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onstart");
	}
	

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("onfinish");
	}
	
	
	
	
	
	
}
