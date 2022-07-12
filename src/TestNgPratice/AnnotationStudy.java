package TestNgPratice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateuserid()
  {
	  Reporter.log("user id", true);
  }
  @Test
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard Validated", true);
  }
  @BeforeMethod
  public void logintokiteapp()
  {
	  Reporter.log("login suscefull", true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Browser Launched", true);
  }
  @AfterMethod
  public void logoutFromKiteApp()
  {
	  Reporter.log("logging out....", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("broser closed", true);
  }
}
