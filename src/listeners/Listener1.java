package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//How to get name
		//result.getName()
		Reporter.log( "TC " +  result.getName()  + " completed Successfully " , true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log( "TC " +result.getName() + " failed " ,true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log( "TC "  +   result.getName()  + " Skipped " ,true);
	}
	
	

}
