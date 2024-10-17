package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class listener implements ITestListener
{
	//pass--->email,sms
	//fail--->email,sms
	//skip--->email,sms
    @Override
	public void onTestSuccess(ITestResult result)
	{
    	Reporter.log("Money transfer successfully", true);
	}
    @Override
    public void onTestFailure(ITestResult result)
    {
    	Reporter.log("Money transfer Failed ", true);
    }
    @Override
    public void onTestSkipped(ITestResult result)
    {
    	Reporter.log("Money trasnfer skipped" , true);
    }
    
    
}
