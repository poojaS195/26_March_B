package KitePomNew1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {

	@FindBy(id = "pin")private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement contiune;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pin(String p)
	{
		Pin.sendKeys(p);
	}
	public void continuebtn()
	{
		contiune.click();
	}
}
