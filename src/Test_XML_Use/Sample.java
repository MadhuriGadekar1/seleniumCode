package Test_XML_Use;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
  @Test
  public void a() {
	  Reporter.log("method a is running", true);
  }
  @Test
  public void b() {
	  Reporter.log("method b is running", true);
  }
  @Test
  public void c() {
	  Reporter.log("method c is running", true);
	 // Assert.fail();
  }
  @Test
  public void d() {
	  Reporter.log("method d is running", true);
  }
}
