package dataProviderUse;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import commonlyMethods.CommonlyUseMethods;

public class Listener extends FBLogin implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result)
	
	{
		try {
			CommonlyUseMethods.takeScreenshot(driver , result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("TakeScreenShot",true);
	}
	@Override

	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Tc is failed",true);
	}

}
