package KitePOMnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppPinPage {

	@FindBy (id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement continuebutton;
	
public KiteAppPinPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void sendpin(String pIN2)
{
	PIN.sendKeys(pIN2);
}
public void contibutn()
{
	continuebutton.click();
}
	
}
