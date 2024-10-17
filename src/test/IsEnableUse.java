package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableUse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(3000);
		//driver.findElement(By.id("mobileNumber")).sendKeys("9518762211");
//		 boolean result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
//		 if(result)
//		 {
//			 driver.findElement(By.xpath("//button[@type='submit']")).click();
//		 }
//		 else
//		 {
//			 System.out.println("Sorry button is not enable");
//		 }
		
		WebElement mobilenoField=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		WebElement getOtpButton=driver.findElement(By.xpath("//button[@type='submit']"));
		
		mobilenoField.sendKeys("8888888888");
		Thread.sleep(2000);
		if(getOtpButton.isEnabled())
		{
			getOtpButton.click();
			System.out.println("otp send");
		}
		else
		{
			System.out.println("Sorry button is not enabled");
		}
		
		
	}

}
