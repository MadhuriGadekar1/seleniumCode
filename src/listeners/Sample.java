package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.Listener1.class)
public class Sample {
  @Test
  public void a() {
	  Reporter.log("A is running", true);
  }
  @Test
  public void b() {
	  Assert.fail();
	  Reporter.log("B is running", true);
  }
  @Test(dependsOnMethods = {"b"})
  public void c() {
	  Reporter.log("C is running", true);
  }
  @Test
  public void d() {
	  Reporter.log("D is running", true);
  }
}
