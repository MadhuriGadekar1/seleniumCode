package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {


    
    	WebDriver driver = new ChromeDriver();
     	driver.manage().window().maximize();    	
   	    driver.get("https://www.makemytrip.com/");
    	Thread.sleep(2000);
    	// handle hidden div popup--> click on close button of popup
    	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
    	Thread.sleep(200);
    	driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).click();

	}

}
