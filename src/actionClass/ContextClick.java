package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {


	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	 WebElement contextclickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	 //to perform action using action class
	 Actions action =new Actions(driver);
	 //action.contextClick(contextclickButton).perform();
	 action.moveToElement(contextclickButton).contextClick().build().perform();
	 
	      
	      

	}

}
