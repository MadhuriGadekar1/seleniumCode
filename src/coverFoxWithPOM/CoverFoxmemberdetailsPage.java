package coverFoxWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxmemberdetailsPage {
@FindBy(id="Age-You")private  WebElement ageDropDown;
@FindBy(className="next-btn")private WebElement NextButton;
//By using constructor to initialize variable
public CoverFoxmemberdetailsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
//use methode to handle dropdown
public void handleDropDown()
{
	Select sel=new Select(ageDropDown);
	sel.selectByValue("22y");
}
public void clickOnNextButton()
{
	NextButton.click();
}

}
