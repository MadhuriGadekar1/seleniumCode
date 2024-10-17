package coverFoxWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxaddressdetailsPage {
@FindBy(xpath="(//input[@type='number'])[1]")private WebElement pinCodeField;
@FindBy(id="want-expert")private WebElement mobileNumberField;
@FindBy(className="next-btn")private WebElement continueButton;

//Variable initialization by using Constructor
public CoverFoxaddressdetailsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//use methode by action
public void enterPinCode()
{
	pinCodeField.sendKeys("411033");
}
public void enterMobileNumber()
{
	mobileNumberField.sendKeys("8888888888");
	
}
public void ClickOnButton()
{
	continueButton.click();
}






}
