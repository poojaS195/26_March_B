package kiteapppomexel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteapploginpage {

	@FindBy(id = "userid") private WebElement UserId;
	@FindBy(id = "password")private WebElement Password;
	@FindBy (xpath = "//button[@type='submit']")private WebElement loginbtn;
	
	
	public kiteapploginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void senduserid(String usrid )
	{
		UserId.sendKeys(usrid);
	}
	public void sendpassword(String passwd)
	{
		Password.sendKeys(passwd);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	
}
