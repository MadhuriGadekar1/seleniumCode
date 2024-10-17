package selectclassuse;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    WebElement carlist = driver.findElement(By.cssSelector("select#cars"));
	    //create a object of select class with passing carlist
	    Select select=new Select(carlist);
	    //check it is multiselectable
	    System.out.println(select.isMultiple());
	    
	    select.selectByIndex(0);
	    Thread.sleep(1000);
	    
	    select.selectByValue("saab");
	    Thread.sleep(1000);
	    
	    select.selectByVisibleText("Audi");
	    Thread.sleep(1000);
	    
	    //how to deselect the element
//	    select.deselectByIndex(0);
//	    Thread.sleep(1000);
//	    select.deselectByValue("audi");
//	    Thread.sleep(1000);
//	    select.deselectByVisibleText("Saab");
//	    Thread.sleep(1000);
//	    select.deselectAll();
	    System.out.println(select.getFirstSelectedOption().getText());
	    System.out.println("===================================================");
	    
	    List<WebElement> allselectOption = select.getAllSelectedOptions();
	   ListIterator<WebElement> lit = allselectOption.listIterator();
	    while(lit.hasNext())
	    {
	    	System.out.println(lit.next().getText());
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
