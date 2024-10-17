package coverFoxWithPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoverFoxTestClass {

	public static void main(String[] args) throws InterruptedException {
//		String excelPath="C:\\Users\\Madhuri Dilwale\\eclipse-workspace\\Automation8_June_Selenium\\TestData\\madhuri.xlsx";
//		String sheetName="Sheet3";

	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		CoverFoxHomePage homePage=new CoverFoxHomePage(driver);
		homePage.ClickOnGenderButton();
		
		CoverFoxHealthPlanPage healthPlanPage=new CoverFoxHealthPlanPage(driver);
		healthPlanPage.ClickOnNextButton();
        
		CoverFoxmemberdetailsPage DetailPage=new CoverFoxmemberdetailsPage(driver);
		DetailPage.handleDropDown();
		DetailPage.clickOnNextButton();
		
		CoverFoxaddressdetailsPage addresDetailPage=new CoverFoxaddressdetailsPage(driver);
		addresDetailPage.enterPinCode();
		addresDetailPage.enterMobileNumber();
		addresDetailPage.ClickOnButton();
		
		CoverFoxResultPage ResultPage=new CoverFoxResultPage(driver);
		Thread.sleep(3000);
		ResultPage.ValidateResult();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
