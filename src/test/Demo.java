package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/signup");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Madhuri");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).clear();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Madhura");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gadekar");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9934567689");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("bgarty");
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
        
        
	}



	}


