package FacebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLoginPage {

	@FindBy(id = "email")private WebElement username;
	@FindBy(id = "pass")private WebElement password;
	@FindBy(xpath = "//button[@name='login']")private WebElement loginbutton;
	
	public facebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void sendpasswrd(String passwd)
	{
		password.sendKeys(passwd);
	}
	public void clicklogin()
	{
		loginbutton.click();
	}
}
