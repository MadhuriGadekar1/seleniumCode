package propertiesfileUse;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonlyMethods.CommonlyUseMethods;

public class sampleTest2 {
  @Test
  public void firstTest() throws IOException {
	 

WebDriver driver =new ChromeDriver();
driver.get(CommonlyUseMethods.readDataFromPropertyFile("url"));
driver.findElement(By.name("firstname")).sendKeys(CommonlyUseMethods.readDataFromPropertyFile("firstname"));
driver.findElement(By.name("lastname")).sendKeys(CommonlyUseMethods.readDataFromPropertyFile("lastname"));
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(CommonlyUseMethods.readDataFromPropertyFile("mobileNo"));
	  
  }
}
