package TestNgPratice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoTationStudyTest1 {
  @Test
  public void rechargePhone()
  {
	  Reporter.log("Recharge done",true);
  }
 
  @BeforeMethod
  public void loginToRechargePortal()
  {
  Reporter.log("login success",true);
  }
  @AfterMethod
  public void logoutFormRechargePortal()
  {
  Reporter.log("logout done",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
  Reporter.log("browser Launched",true);
  }
  @AfterClass
  public void closeBrowser()
  {
  Reporter.log("browser closed",true);
  }
  }


