package screenSort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenSortUse {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		//to create a object of Takescreenshot interface with typecast to driver 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		//Screenshot store in desired location
	    File dest =new File("C:\\screenShot\\myScreenSort.png");

	    FileHandler.copy(source, dest);
       
		

	}



	}


