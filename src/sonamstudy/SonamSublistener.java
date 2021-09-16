package sonamstudy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.TakeScreenShotOfApp;

public class SonamSublistener extends SonamListener implements ITestListener
{

	@Override// results.getname gives test case name
	public void onTestStart(ITestResult result) {
		
		System.out.println("on test start:" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("on test success:" + result.getName());
	
		
	}
		
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure:" + result.getName());
		

		try {
			TakeScreenShotOfApp.captureScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{System.out.println("on test failure:" + result.getName());
	
	
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}	
		

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override// context.getname gives tagname from xml file
	public void onStart(ITestContext context) 
	{
		System.out.println("on start :" + context.getName());
		}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on test success:" + context.getName());
	}

}
