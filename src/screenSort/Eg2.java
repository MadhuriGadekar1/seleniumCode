package screenSort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg2 {

	public static void main(String[] args) throws IOException {


      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/signup");
      String random=RandomString.make(3);
      File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File Desc=new File("C:\\screenShot//test_" + random + ".png");
      FileHandler.copy(Source, Desc);
      
      
      
      
	}

}
