package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaationTest1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		// driver.close();

	}
}
