package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/hotels/");
		//driver.findElement(By.xpath("//span[text()='Hotels'][2]"));
		driver.findElement(By.xpath("//li[contains(@class,'makeFlex')][3]")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9028487139");
	}

}
