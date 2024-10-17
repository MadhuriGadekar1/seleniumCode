package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

public static void main(String[] args) throws InterruptedException {
    


	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	driver.get("https://www.naukri.com/");
	//Thread.sleep(2000);
	driver.navigate().to("https://www.redbus.in/");
	//Thread.sleep(2000);
	driver.navigate().back();
	//Thread.sleep(2000);
	driver.navigate().forward();
	//Thread.sleep(2000);
	driver.navigate().refresh();
	//Thread.sleep(2000);
	
	
	


		


	}

}
