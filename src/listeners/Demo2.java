package listeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test(dependsOnMethods = {"ValidPinCodeForNetBanking"})
  public void MoneyTrasferForNetBanking() {
	  Reporter.log("Money trasfer successfully",true);
  }
  @Test
  public void ValidPinCodeForNetBanking()
  {
	  Reporter.log("Test", true);
  }
}
