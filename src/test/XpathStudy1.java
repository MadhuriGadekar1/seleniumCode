package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy1 {

	public static  void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("madhuri.gadekar456@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tanishka@123");
	    driver.findElement(By.xpath("//button[@value='1']")).click();
	    driver.findElement(By.linkText("Forgotten password?")).click();
       

	}

}
