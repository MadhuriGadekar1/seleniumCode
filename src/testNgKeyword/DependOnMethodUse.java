package testNgKeyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethodUse {
  
	

	@Test
	public void Login()
	{
	Reporter.log("Login sucessfully",true);
	Assert.fail();
	}
	@Test
	public void VerifyPin()
	{
	Reporter.log("Pin Verified",true);
	}
	@Test (dependsOnMethods = "Login")
	public void Logout()
	{
	Reporter.log("Logout success", true);
	}

}
