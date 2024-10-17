package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://z-upload.facebook.com/reg/");
		//1.identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		//2.create select class which will acceptWebElement as argument
		
		
		
		

	}

}
