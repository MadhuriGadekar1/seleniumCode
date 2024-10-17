package testNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy 
{
  
	@Test()
	  public void M1() {
		  Reporter.log("My first Method is M1 ", true);  
	  } 
	 @Test(timeOut = 2000)
	 public void M2() throws InterruptedException
	 {
		 Reporter.log("My second Method is M2", true);
		 Thread.sleep(1000);
	 }
	 @Test()
	 public void M3()
	 {
		 Reporter.log("My Third method is M3", true);
	 }
	 @Test()
	 public void M4()
	 {
		 Reporter.log("My forth method is M4", true);
	 
}
}
