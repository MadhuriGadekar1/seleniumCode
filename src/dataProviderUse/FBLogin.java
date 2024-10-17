package dataProviderUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(dataProviderUse.Listener.class)
public class FBLogin {
	 static WebDriver driver;
      //@Test(dataProviderClass=dataProviderUse.TestData.class,dataProvider="femaleData")
	@Test(dataProvider="PlayerData")
	
  public void fb(String firstname,String lastname,String mobNo)
  {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobNo);
  }
  //We can pass data to dataprovider with same class
  // so that time we use only @Test(dataProvider="nameOfDataProvider")
	@DataProvider(name="PlayerData")
	public String [][] testData()
	{
		String [][]data= {{"rohit","Sharma","1111111111"},{"Surya","Yadav","2222222222"},{"Rushabh","Pant","5555555555"}};
		return data;
		
	}
}
