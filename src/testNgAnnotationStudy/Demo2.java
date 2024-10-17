package testNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void MyTestClass1() {
	  Reporter.log("MyFirst test class is running", true);
  }
  @Test
  public void MyTestClass2()
  {
	  Reporter.log("MySecond Test Class is running",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	Reporter.log("Before Method is running",true);  
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After method is running", true);
  }
  @BeforeClass
  public void beforeClassMethod()
  {
	  Reporter.log("Before class method is running", true);
  }
  @AfterClass
  public void afterClassMethod()
  {
	  Reporter.log("After class method is running",true);
  }
  
}
