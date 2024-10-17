package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/home");
		
		//use implicite waits
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		

		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
       
		

	}

}
