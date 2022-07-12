package KitePomNew1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "userid")private WebElement username;
	@FindBy(id = "password")private WebElement passwd;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void usernm(String un)
	{
		username.sendKeys(un);
	}
	public void password(String pas)
	{
		passwd.sendKeys(pas);
	}
	public void login()
	{
		loginbtn.click();
	}
}
