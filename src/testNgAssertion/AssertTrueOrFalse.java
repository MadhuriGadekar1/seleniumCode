package testNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueOrFalse {
  @Test
  public void Demo() {
	  boolean a=true;
	  boolean b=false;
	  //Assert.assertTrue(b,"value is not true,tc is failed");
	  Assert.assertFalse(b, "value is true ,tc is failed");
	  

	  
  }
}
