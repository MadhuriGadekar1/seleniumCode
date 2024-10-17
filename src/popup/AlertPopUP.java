package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUP {

	public static void main(String[] args) throws InterruptedException {

   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.automationtesting.in/Alerts.html");
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
   //When we handle a alert popup first we should switch selenium focus
   Alert alt=driver.switchTo().alert();
   //To get the text present on that pop up we use
   //getText method
   System.out.println(alt.getText());
   alt.accept();
   //to click on cancel button we use alt.dismiss()
   alt.dismiss();
   driver.findElement(By.linkText("Home")).click();
   
   
   
  

       

	}

}
