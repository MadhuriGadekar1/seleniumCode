package chromeOptionClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleArguments {

	public static void main(String[] args) {
//   ArrayList<String>li=new ArrayList<String>();
//   li.add("-disable-notifications");
//   li.add("start-maximized");
//   li.add("--incognito");
//   
//   
//   ChromeOptions co=new ChromeOptions();
//   co.addArguments(li);
//   WebDriver driver = new ChromeDriver(co);
//   driver.get("https://www.justdial.com/");
   
   
   
   
   ArrayList<String>al= new ArrayList<String>();
   al.add("-disable-notifications");
   al.add("--incognito");
   al.add("start-maximized");

   ChromeOptions opt= new ChromeOptions();
   opt.addArguments(al);
   WebDriver driver= new ChromeDriver(opt);
   driver.get("https://www.justdial.com/");
	}

}
