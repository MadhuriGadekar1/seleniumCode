package Test_XML_Use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupKeywordUse {
  @Test(groups = {"saving account","account opening"})
  public void a() {
	  Reporter.log("It is a testcase running", true);
  }
  @Test(groups={"account opening"})
  public void b() {
	  Reporter.log("It is b testcase running", true);
  }
  @Test
  public void c() {
	  Reporter.log("It is c testcase running", true);
  }
  @Test(groups= {"account opening"})
  public void d() {
	  Reporter.log("It is d testcase running", true);
  }
}
