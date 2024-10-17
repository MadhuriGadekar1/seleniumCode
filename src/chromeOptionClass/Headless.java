package chromeOptionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) throws InterruptedException {

//    ChromeOptions co=new ChromeOptions();
//    Thread.sleep(1000);
//    co.addArguments("--headless=chrome");
//    WebDriver driver=new ChromeDriver(co);
//    driver.get("https://www.naukri.com/");
//    Thread.sleep(1000);
//    String text = driver.findElement(By.xpath("//h1[contains(text(),'Find your')]")).getText();
//    System.out.println(text);
    
    ChromeOptions co= new ChromeOptions();
    Thread.sleep(1000);
    co.addArguments("--headless=chrome");
    WebDriver driver = new ChromeDriver(co);
    driver.get("https://www.naukri.com/");

    String text = driver.findElement(By.className("qsb-title")).getText();
    System.out.println(text);

	}

}
