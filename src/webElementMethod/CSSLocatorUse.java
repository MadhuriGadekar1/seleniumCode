package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorUse {

	public static void main(String[] args) {

   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.naukri.com/");
   //driver.findElement(By.cssSelector("a#login_Layer")).click();
   driver.findElement(By.cssSelector("a#register_Layer")).click();
   Boolean result=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
   System.out.println(result);
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
