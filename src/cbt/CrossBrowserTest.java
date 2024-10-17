package cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  WebDriver driver ;
  @Parameters("browser")
  @Test
  public void FbTest(String browser) throws InterruptedException {
	  
	 if(browser.equals("Chrome"))
	 {
		 driver=new ChromeDriver();
	 }else if(browser.equals("Edge"))
	 {
		 driver=new EdgeDriver();
		 }

	  
      Thread.sleep(2000);
	  //driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys("abcd");
	  driver.findElement(By.name("lastname")).sendKeys("velocity");
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8888888888");
	  
	  
	  
	  
	  
	  
	  
  }
}
