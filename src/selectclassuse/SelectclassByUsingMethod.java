package selectclassuse;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassByUsingMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();

		WebElement day = driver.findElement(By.name("birthday_day"));
		// create a object of select class
		Select sel = new Select(day);
		sel.selectByValue("19");

		// give all the days option
		List<WebElement> allDays = sel.getOptions();
		ListIterator<WebElement> it = allDays.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next().getText() + " ");
		}
		System.out.println("=================================================");
		
		WebElement month = driver.findElement(By.id("month"));
		// create a object of select class
		Select sel1 = new Select(month);
		sel1.selectByVisibleText("Feb");
		// retrive all month
		List<WebElement> allmonth = sel1.getOptions();
		ListIterator<WebElement> itm = allmonth.listIterator();
		while (itm.hasNext()) {
			System.out.println(itm.next().getText());
		}
		System.out.println("===================================================");

		WebElement year = driver.findElement(By.cssSelector("select#year"));
		// create object of select class
		Select sel2 = new Select(year);
		sel2.selectByIndex(4);
		List<WebElement> allyear = sel2.getOptions();
		ListIterator<WebElement> ity = allyear.listIterator();
		while(ity.hasNext())
		{
			System.out.println(ity.next().getText());
		}
       System.out.println("=======================================================");
	}

}
