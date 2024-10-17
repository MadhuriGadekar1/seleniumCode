package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.listener.class)
public class Demo1 {
	
  @Test(dependsOnMethods = {"ValidPinCodeForATM"})
  
  public void moneyTrasferForATM() {
	  Reporter.log("Money trasfer for ATM",true);
	  //pass.fail,skipped
  }
  @Test
  public void ValidPinCodeForATM()
  {
	  Assert.fail();
	  Reporter.log("Test", true);
  }
}
