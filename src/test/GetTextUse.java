package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	    String exceptedResult = driver.findElement(By.xpath("//div[contains(text(),'Create ')]")).getText();
       String ActualResult="Create a new account";
       if(ActualResult.equals(exceptedResult))
       {
    	   System.out.println("Test case is pass");
       }
       else
       {
    	   System.out.println("Test Case is fail");
       }
       
       	
        
	}

}
