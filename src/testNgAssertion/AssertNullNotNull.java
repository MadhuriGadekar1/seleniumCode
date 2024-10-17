package testNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void sample() {
	  String a="Pune";
	  String b=null;
	  //Assert.assertNull(a, "value is not null,Test case Failed");
	 // Assert.assertNotNull(a,"Value is null,testcase failed");
	  Assert.assertNull(b,"value is not null,testcase is failed");
  }
}
