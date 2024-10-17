package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLInkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Already have an")).click();
		driver.findElement(By.name("email")).sendKeys("madhurigadekar112@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("loginbutton")).click();
	}

}

