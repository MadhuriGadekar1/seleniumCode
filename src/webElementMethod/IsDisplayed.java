package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("hide-textbox")).click();
		// driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(3000);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		if (textBox.isDisplayed()) {
			textBox.sendKeys("Good Evening");
		} else {
			System.out.println("element not displayed");
		}
	}

}
