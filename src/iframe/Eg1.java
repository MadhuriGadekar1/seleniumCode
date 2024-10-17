package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
          Thread.sleep(1000);
          
		//switch selenium focus main page to frame
          driver.switchTo().frame("iframeResult");
        WebElement heading = driver.findElement(By.xpath("//h1[text()='This is a Heading']"));
        System.out.println( heading.getText());
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
}

}
