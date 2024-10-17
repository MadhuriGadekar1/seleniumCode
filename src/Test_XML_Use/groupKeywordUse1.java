package Test_XML_Use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupKeywordUse1 {
  
	@Test(groups = {"saving account"})
	  public void e() {
		  Reporter.log("It is e testcase running", true);
	  }
	  @Test(groups={"account opening"})
	  public void f() {
		  Reporter.log("It is f testcase running", true);
	  }
	  @Test
	  public void g() {
		  Reporter.log("It is g testcase running", true);
	  }
	  @Test(groups= {"saving account"})
	  public void h() {
		  Reporter.log("It is h testcase running", true);
	  }
}
