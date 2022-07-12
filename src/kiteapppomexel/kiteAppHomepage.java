package kiteapppomexel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteAppHomepage {

	@FindBy(xpath = "//span[text()='ELR321']")private WebElement userID;
	
	public kiteAppHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void matchuserID(String expecteId)
	{
		String actualid=userID.getText();
		String expectedid=expecteId;
		if(actualid.equals(expectedid))
		{
			System.out.println("id match");
		}
		else
		{
			System.out.println("id not match");
		}
		
		
	}
	public void clickuserid() throws InterruptedException
	{
		userID.click();

		
		
	}
	
}
