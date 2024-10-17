package framwork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import commonlyMethods.CommonlyUseMethods;

public class CoverFoxTC01 {

	public static void main(String[] args) throws InterruptedException, IOException {
       
		String ExcelPath="C:\\Users\\Madhuri Dilwale\\eclipse-workspace\\Automation8_June_Selenium\\TestData\\madhuri.xlsx";
		String sheetName="Sheet3";
		String age = CommonlyUseMethods.readDataFromExcel(ExcelPath, sheetName, 0, 0);
		String pincode = CommonlyUseMethods.readDataFromExcel(ExcelPath, sheetName, 0, 1);
		String mobNum = CommonlyUseMethods.readDataFromExcel(ExcelPath, sheetName, 0, 2);
		
		
		
		
      ChromeOptions options=new ChromeOptions();
      options.addArguments("--disable-notifications");
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.get("https://www.coverfox.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      driver.findElement(By.xpath("//div[text()='Male']")).click();
      Thread.sleep(1000);
      driver.findElement(By.className("next-btn")).click();
      Thread.sleep(1000);
      //Handling dropdown
       WebElement ageDropDown = driver.findElement(By.id("Age-You"));
       Select sel=new Select(ageDropDown);
       sel.selectByValue(age+"y");
       CommonlyUseMethods.takeScreenshot(driver, "age");
       Thread.sleep(1000);
       driver.findElement(By.className("next-btn")).click();
       Thread.sleep(300);//page load
       
    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(pincode);
    driver.findElement(By.id("want-expert")).sendKeys(mobNum);
      CommonlyUseMethods.takeScreenshot(driver, "Mob_Pin");
     driver.findElement(By.className("next-btn")).click();
     Thread.sleep(4000);
     String ResultText = driver.findElement(By.xpath("//div[contains(text(),' Insurance Plans')]")).getText();
      String NumberInString = ResultText.substring(0, 2);
      int ResultNum = Integer.parseInt(NumberInString);
      
      
      //FindLocators of banner using Findelemnts method
     int NumberOfBanners = driver.findElements(By.className("plan-card-container")).size();

     if(NumberOfBanners==ResultNum)
     {
    	 System.out.println("Banners matching with result number,Tc is passed");
     }
     else
     {
    	 System.out.println("Banners are not matching with result number,Tcis failed");
     }
//       
//       
//       String resultText = driver.findElement(By.xpath("//div[contains(text(),'50 matching Health')]")).getText();
//		String numInString = resultText.substring(0, 2);
//		//String to int convesrsion
//		int totalResultNumber = Integer.parseInt(numInString);
//		System.out.println("total matching results: " + totalResultNumber);
//		int numOfBanner = driver.findElements(By.xpath("//div[@class='plan-card-container']")).size();
//
//		if (numOfBanner == totalResultNumber) {
//			System.out.println("banner matching with result number, TC is Passed");
//		} else {
//			System.out.println("banner is matching with result number, TC is failed");
//		}
      
      
      

	}

}
