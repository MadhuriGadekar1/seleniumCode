package selectclassuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
        WebElement day = driver.findElement(By.id("day"));


        //Create a object of select class
        Select sel=new Select(day);
        sel.selectByVisibleText("4");
       Thread.sleep(2000);
      
       WebElement month=driver.findElement(By.id("month"));
       //create a object of select class
       Select sel1=new Select(month);
       sel1.selectByValue("12");
       Thread.sleep(2000);
       
       WebElement year=driver.findElement(By.id("year"));
       Select sel2=new Select(year);
       sel2.selectByIndex(5);
       Thread.sleep(2000);
       
        
        
	}

}
