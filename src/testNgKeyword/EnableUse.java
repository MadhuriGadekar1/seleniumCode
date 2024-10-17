package testNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
 
	@Test(enabled = false)
	  public void M1() {
		  Reporter.log("My first Method is M1 ", true);  
	  } 
	 @Test()
	 public void M2()
	 {
		 Reporter.log("My second Method is M2", true);
	 }
	 @Test(enabled=false)
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
