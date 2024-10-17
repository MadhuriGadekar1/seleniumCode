package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void myTest1() {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.co.in/");
  }
  @Test
  public void myTest2()
  {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://z-upload.facebook.com/reg/");
  }
}
