package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMnew.KiteAppHomePage;
import KitePOMnew.KiteAppPinPage;
import KitePOMnew.KiteLoginPage;
import KiteUtility.Utility;

public class ValidateKiteUserId extends Base {
  
	KiteAppHomePage home;
	KiteLoginPage login;
	KiteAppPinPage pin;
	String tCid="1234";
	
	
	
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
	  login.sendusername(Utility.readDataFromExcel(0, 0));
	  login.sendpassword(Utility.readDataFromExcel(0, 1));
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(Utility.readDataFromExcel(0, 2));
	  pin.contibutn();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
	
	
	@Test
	public void validateuserid() throws EncryptedDocumentException, IOException
  //public void validateuserid() throws EncryptedDocumentException, IOException
  {
	  
	  Assert.assertEquals(home.hetActualUserName(),Utility.readDataFromExcel(0, 0),"TC fail");
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
