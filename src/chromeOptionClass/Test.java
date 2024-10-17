package chromeOptionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) {
    //How to open the browser in incognito mode
	//to create object of chromeOption Class


		ChromeOptions co = new ChromeOptions();
        //use method addArguments()pass desired option
		co.addArguments("--incognito");
		 WebDriver driver = new ChromeDriver(co);
		 driver.get("https://www.naukri.com/");


	}

}
