package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        //driver.get("https://www.redbus.in/");
        driver.get("https://www.facebook.com/");
        //String title = driver.getTitle();
        //System.out.println(title);
        
        //String url=driver.getCurrentUrl();
        //System.out.println(url);
        
       
       
       WebElement firstname=driver.findElement(By.xpath("[@name='firstname']"));
       firstname.sendKeys("Madhuri");


	}

}
