package testNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
  @Test
  public void Tc1() {
	  Reporter.log("My 1st Test case", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("Before method class", true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After method Class", true);
  }
}
