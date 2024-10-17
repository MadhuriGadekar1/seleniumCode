package cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest2 {
  WebDriver driver =new ChromeDriver();
  @Parameters({"firstname","lastname","mobilenumber"})
  @Test
  public void FbTest(String firstname,String lastname,String mobilenumber) throws InterruptedException {
	  
	  Thread.sleep(2000);
	  //driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(mobilenumber);
	  
	  
	  
	  
	  
	  
	  
  }
}
