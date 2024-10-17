package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.listener.class)
public class Demo {
  @Test
  public void moneyTrasferForATM() {
	  Reporter.log("Money trasfer for ATM",true);
  }
  @Test
  public void ValidPinCodeForATM()
  {
	  Reporter.log("Test", true);
  }
}
