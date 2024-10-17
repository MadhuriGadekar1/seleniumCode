package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
      

	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(14000));
	      //driver.findElement(By.xpath("//button[text()='Click Me']")).click();
          //To perform click action by using Action Class
	      WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
	      String clickButton1 = driver.findElement(By.xpath("//button[text()='Click Me']")).getText();
	      System.out.println(clickButton1);
          //To perform Action using action class
	      //To create object of Action class to pass driver as a parameter
	      Actions action=new Actions(driver);
	      //one of the action class method take required action
	     // action.click(clickButton).perform();
	      action.moveToElement(clickButton). click().build().perform();
	      
	}

}
