package testNgAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertion {
  @Test
  public void Demo1() {
	  String a="Velocity";
	  String b="katraj";
	  String c="Pune";
	  Assert.assertEquals(a, b, "Value is not equal.tc is failed");
	  Assert.assertNotNull(c,"value is not null,tc is failed");
	 
  }
	@Test
	public void Demo2()
	{
	String a="Pune";
	String b="katraj";
	Assert.assertNotEquals(a, b, "Value of both are not equals,TC is failed");
	}
	
  }

