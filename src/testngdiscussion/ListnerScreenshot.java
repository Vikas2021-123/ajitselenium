package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.TakeScreenShotOfApp;

public class ListnerScreenshot extends TestNgListner implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("test case :"+ result.getName()+ "has been started");
	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test name :" + result.getName()+ "has passed" );
	}
	
	
	

	@Override // gives test case name
	public void onTestFailure(ITestResult result) {
		System.out.println("test case :" + result.getName()+ "has failed");
		
		try {
			TakeScreenShotOfApp.captureScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case :" + result.getName()+ "has skipped");
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

	@Override // context.getname gives us <test> name
	public void onStart(ITestContext context) {
		
		System.out.println("test case :"+context.getName()+ "has started" );
	}

	@Override // gives test tag name
	public void onFinish(ITestContext context) {
		
		System.out.println(context.getName()+ "has finish" );
		}
	
	

}
