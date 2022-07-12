package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitePOMnew.KiteAppHomePage;
import KitePOMnew.KiteAppPinPage;
import KitePOMnew.KiteLoginPage;
import KiteUtility.NewUtilityprop;
import KiteUtility.Utility;

public class validateusingPropertiFile {
WebDriver driver;
	KiteAppHomePage home;
	KiteLoginPage login;
	KiteAppPinPage pin;
	String tCid="555";
	
	
	
	@BeforeClass
  public void lunchbrowser()
  {
	  openbrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KiteAppPinPage(driver);
	  home=new KiteAppHomePage(driver);
	  
  }
  
@BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.sendusername(NewUtilityprop.getDataFromPropertiFile("UN"));
	  login.sendpassword(NewUtilityprop.getDataFromPropertiFile("PWD"));
	  login.clickOnLoginButton();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(NewUtilityprop.getDataFromPropertiFile("PIN"));
	  pin.contibutn();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
	
	
	@Test
	public void validateuserid() throws EncryptedDocumentException, IOException
  {
	  
	  Assert.assertEquals(home.hetActualUserName(),NewUtilityprop.getDataFromPropertiFile("tCID"),"TC fail");
	  Utility.capturescreenshot(driver, tCid);
  }
	@AfterMethod
	public void logoutkite() throws InterruptedException
	{
		home.logoutbtn();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
}
