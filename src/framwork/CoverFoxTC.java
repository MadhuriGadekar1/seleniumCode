package framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxTC {

	public static void main(String[] args) throws InterruptedException {

   ChromeOptions options=new ChromeOptions();
   options.addArguments("--disable-notifications");

	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.coverfox.com/");
	driver.findElement(By.xpath("//div[text()='Female']")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("next-btn")).click();
	Thread.sleep(1000);
	WebElement AgeDropDown = driver.findElement(By.id("Age-You"));
	Select sel=new Select(AgeDropDown);
	sel.selectByValue("19y");
	driver.findElement(By.className("next-btn")).click();
	Thread.sleep(1000);//PageLoad
	driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("411033");
	driver.findElement(By.id("want-expert")).sendKeys("8888888888");
	driver.findElement(By.xpath("//div[text()='Continue']")).click();
	Thread.sleep(4000);
	String ResultText = driver.findElement(By.xpath("//div[contains(text(),'Health Insurance Plans')]")).getText();
	String numberInString =  ResultText.substring(0, 2);
	int resultNumber = Integer.parseInt(numberInString);
	System.out.println("Totalnumber " + resultNumber );
	
	//find locators of banners by using findElements method
	int NumberOfBanners = driver.findElements(By.xpath("//div[@class='plan-card-container']")).size();
	if(NumberOfBanners== resultNumber)
	{
		System.out.println("Banners matching with result number,TC is passed");
	}
	else
	{
		System.out.println("Banners matching without result number,TC is Fails");
	}
	}

}
