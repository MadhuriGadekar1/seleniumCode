package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstgramXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("Madhuri");
		driver.findElement(By.xpath("/input[@name='fullName']")).sendKeys("gadekar");

	}

}
