package testNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeMethod
	 public void beforeMethod()
	  {
		  Reporter.log("BeforeMethode is running",true);
	  }
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("AfterMethod is running", true);
	}
    @Test
     public void TestClass1() {
	  Reporter.log("MyFirstTest method is running", true);
  }
    @Test
    public void TestClass2() {
    	Reporter.log("MySecond Test Method is running", true);
    }
 
}
