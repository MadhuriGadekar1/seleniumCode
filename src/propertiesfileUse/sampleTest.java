package propertiesfileUse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest {
  @Test
  public void firstTest() throws IOException {
	  Properties pro=new Properties();
	  FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"\\configue.properties");
	  pro.load(myfile);
	  WebDriver driver =new ChromeDriver();
	  driver.get(pro.getProperty("url"));
	  driver.findElement(By.name("firstname")).sendKeys(pro.getProperty("firstname"));
	  driver.findElement(By.name("lastname")).sendKeys(pro.getProperty("lastname"));
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(pro.getProperty("mobileNo"));
	  
  }
}
