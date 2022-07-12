package TestNgKeywords;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassGroupning1 {
  @Test(groups= {"sanity"})
  public void p() {
	 
     Assert.fail();
	  Reporter.log("p isrunning", false);
  }
  
  @Test(groups= {"sanity"})
  public void q() {
	  Reporter.log("Q isrunning", false);
  }
  @Test(groups= {"regression"})
  public void r() {
	  Reporter.log("R isrunning", false);
  }
}
