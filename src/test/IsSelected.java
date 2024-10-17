package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Boolean result =driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(result);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Boolean result1=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(result1);

	}




}
