package coverFoxWithPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {
@FindBy(xpath="//div[contains(text(),'Health Insurance Plans')]") private WebElement  Result_Text;
@FindBy(className="plan-card-container")private List<WebElement> planList;
     
//constructor 
public  CoverFoxResultPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void ValidateResult()
{
	String resultInString = Result_Text.getText().substring(0, 2);

    int resultNumber = Integer.parseInt(resultInString);
    int planListNumber = planList.size();
    System.out.println("Result Number is"+resultNumber );
    System.out.println("Plan list number is"+planListNumber);
    
    if(resultNumber==planListNumber)
    {
    	System.out.println("Result are matching TC is passed");
    }
    else
    {
    	System.out.println("Result are not matching,TC is falied");
    }
} 

}
