package webtable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WT_SingleRowReading {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//find total no of rows
		int NoRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
        System.out.println("No of total Rows" + NoRows);
        System.out.println("============================================================");
        //find total no of column
        int NoColumn = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
        System.out.println("No of total column" + NoColumn);
        System.out.println("==============================================================");
        
        //Read complete header
        for(int i=1;i<=NoColumn;i++)
        {

            String HeaderData = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th["+i+"]")).getText();
             System.out.print( HeaderData+" ");
        }
        System.out.println();
        System.out.println("================================================================");
        
        //Read complete column data
        for(int i=2;i<NoRows;i++)
        {
        	 String CompleteRowData = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[2]")).getText();
        	 System.out.println(CompleteRowData+" ");
        }
        System.out.println();
        System.out.println("==================================================================");
	}

}
