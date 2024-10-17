package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindXpath {

	public static void main(String[] args) throws InterruptedException {

     
     WebDriver driver = new ChromeDriver();
     driver. manage().window().maximize();
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("h2[contains(text(), 'Facebook helps you connect a')]"));
   //h2[contains(text(), 'Facebook helps you connect a')]
	}

}
