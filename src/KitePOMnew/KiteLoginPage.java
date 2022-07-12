package KitePOMnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	//private int a;
	//1. data members
	
	@FindBy(id = "userid") private WebElement userName;
	@FindBy (id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement login;
	
	//2.Constructor
	public KiteLoginPage( WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3.methods
	public void sendusername(String uN)
	{
		userName.sendKeys(uN);
		
	}
	public void sendpassword(String pWD)
	{
		password.sendKeys(pWD);
	}
	public void clickOnLoginButton()
	{
		login.click();
	}
	
	
}
