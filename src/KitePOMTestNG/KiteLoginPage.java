package KitePOMTestNG;

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
		userName.sendKeys("ELR321");
		
	}
	public void sendpassword(String pWD)
	{
		password.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
		login.click();
	}
	
	
}
