package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementMethod {

	public static void main(String[] args) {

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
 WebElement refElement = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));

        		 Actions actions= new Actions(driver);
        		 actions.scrollToElement(refElement).perform();
}
}