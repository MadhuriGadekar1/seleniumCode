package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {


		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		//Perform doubleclick using action class
		Actions action=new Actions(driver);
		//action.doubleClick(DoubleClickButton).perform();
		action.moveToElement(DoubleClickButton).doubleClick().build().perform();
		

	}

}
