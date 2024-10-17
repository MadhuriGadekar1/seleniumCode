package chromeOptionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BLockNotification {

	public static void main(String[] args) {

     //create object of Chromeoption class
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("-disable-notifications");
		//how to start browser in maximized mode
		co.addArguments("start-maximized");
		 WebDriver driver = new ChromeDriver(co);

		 driver.get("https://www.justdial.com/");
	}

}
