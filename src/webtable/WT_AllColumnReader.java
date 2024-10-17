package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_AllColumnReader {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

		int totalNoRows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		System.out.println(totalNoRows);
		int totalNoColumn = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
		System.out.println(totalNoColumn);
		//read all rows and columns except header
		//outer loop for rows
		for(int i=1;i<= totalNoRows;i++)
		{
			//inner for loop for column
			for(int j=1;j<=totalNoColumn;j++)
			{
			String value =driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();
            System.out.print(value+"||");
			}
			System.out.println();
			
		}
	}
}

