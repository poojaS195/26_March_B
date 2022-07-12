package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppHomePage {

	@FindBy(xpath = "//span[@class='user-id']")private WebElement uname;
@FindBy(xpath = "//a[@href='/logout']")private WebElement logoutbutton;
public KiteAppHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void usrnmmatch()
{
	   String actual = uname.getText();
	String excepted = "ELR321";
	if(actual.equals(excepted))
	{
		System.out.println("id match");
	}
	else
	{
		System.out.println("id not match");
	}
}

public void logoutbtn() throws InterruptedException
{
	uname.click();
	Thread.sleep(1000);
	logoutbutton.click();
	
}

}

