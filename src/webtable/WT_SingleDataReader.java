
package webtable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class WT_SingleDataReader {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        String Headerdata1 = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th[1]")).getText();
        System.out.println(Headerdata1);
        System.out.println("========================================================");
        //Any desired data
        String DesirdData = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[5]/td[2]")).getText();
        System.out.println(DesirdData);
        System.out.println("========================================================");
	}

}
