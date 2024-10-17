package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='ai_input']")).sendKeys("Madhuri");
		driver.findElement(By.xpath("//input[@id='ai_input']")).click();
		//input[@name='email']
		
		
         
		
	    


	}
}
