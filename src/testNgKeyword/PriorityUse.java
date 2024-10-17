package testNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority=-2)
  public void M1() {
	  Reporter.log("My first Method is M1 ", true);  
  } 
 @Test(priority = -4)
 public void M2()
 {
	 Reporter.log("My second Method is M2", true);
 }
 @Test(priority = -1)
 public void M3()
 {
	 Reporter.log("My Third method is M3", true);
 }
 @Test(priority = -3)
 public void M4()
 {
	 Reporter.log("My forth method is M4", true);
 
  
  
  
  
  }
}
