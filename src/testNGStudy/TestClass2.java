package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void Demo() {
	  System.out.println("Hii this is a printing statment");
	  Reporter.log("Hii This is Reporter with single parameter");
	  Reporter.log("Hii This is Reporter with double parameter", true);
  }
}
