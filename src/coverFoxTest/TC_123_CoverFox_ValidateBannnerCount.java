package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxPOM.CoverFoxaddressdetailsPage;
import coverFoxPOM.CoverFoxmemberdetailsPage1;
import coverFoxUtility.Utility;
import coverFoxWithPOM.CoverFoxHomePage;
import coverFoxWithPOM.CoverFoxmemberdetailsPage;

public class TC_123_CoverFox_ValidateBannnerCount extends Base {
	
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
	//CoverFoxmemberdetailsPage1 memberdetailsPage; 
	CoverFoxmemberdetailsPage1 memberdetailsPage;
	CoverFoxaddressdetailsPage addressdetailPage;
	CoverFoxResultPage resultPage;
	//String excelPath="C:\\Users\\Madhuri Dilwale\\eclipse-workspace\\Automation8_June_Selenium\\TestData\\madhuri.xlsx";
	String excelPath=System.getProperty("user.dir")+"\\TestData\\madhuri.xlsx";
	String sheetName="Sheet3";
	
	
	
	//Open browser/app
	

	  
    @BeforeClass
    public void openApplication() throws IOException
    {
    	launchBrowser();
    	
    }
	//gender Selection, next button click,  Age selection , Dial pincode and mobile number click on  next
    @BeforeMethod
    public void enterDetail()throws IOException,EncryptedDocumentException,InterruptedException
    {
    	homePage=new CoverFoxHomePage(driver);
    	healthPlanPage=new CoverFoxHealthPlanPage(driver);
        memberdetailsPage=new CoverFoxmemberdetailsPage1(driver);
    	addressdetailPage=new CoverFoxaddressdetailsPage (driver);
    	resultPage=new CoverFoxResultPage(driver); 
    	
    	homePage.ClickOnGenderButton();
    	Thread.sleep(1000);
    	
    	healthPlanPage.ClickOnNextButton();
    	Thread.sleep(1000);
    	
    	memberdetailsPage.handleAgeDropDown(Utility.readDataFromExcel(excelPath, sheetName, 0, 0));
    	memberdetailsPage.clickOnNextButton();
 
    	Thread.sleep(3000);
    	addressdetailPage.enterPinCode(Utility.readDataFromExcel(excelPath, sheetName, 0, 1));
    	addressdetailPage.enterMobileNumber(Utility.readDataFromExcel(excelPath, sheetName, 0, 2));
    	addressdetailPage.ClickOnContinueButton();
    	Thread.sleep(3000);
    }


	
	
  @Test
  public void validatePolicyCount() {
	 int textCount = resultPage.getCountFromText() ;
	 int bannerCount=resultPage.getCountFromBanner();
	 Assert.assertEquals( textCount ,bannerCount,"textCount is not matching with Banner Count ,TC is Failed" );
	 // Assert.fail();
	  
  }
  
  //logout
  @AfterClass
  public void closeApplication()
  {
	  closeBrowser();
  }
  
  //close browser/App is close
}
