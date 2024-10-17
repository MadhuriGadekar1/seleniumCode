package testNgAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionStudy {
  @Test
  public void Demo() {
	  //When we use soft assertion so that all methods 
	  //are non static so we create a object of soft assertion
	  String a="Velocity";
	  String b="katraj";
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(a, b, "values of both are not equals,TC is Failed");
	  soft.assertNull(b,"Value is not null TC is Failed");
	  soft.assertAll();
	  
	  
  }
}
