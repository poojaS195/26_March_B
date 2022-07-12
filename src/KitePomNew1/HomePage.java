package KitePomNew1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@class='user-id']")private WebElement uname;
	@FindBy(xpath = "//a[@href='/logout']")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void unamematch()
	{
		
	}
	
}
