package testNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
  @Test
  public void Demo1() {
	  String a="Velocity";
	  String b="Testing";
	  String c="AutomationTesting";
	  //Assert.assertEquals(a,b,"both are not equals,TestCase is Failed" );
	  Assert.assertNotEquals(a, c,"both are equals,TestCase is Failed");
  }
}
