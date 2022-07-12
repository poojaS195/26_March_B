package TestNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassGrouping {
  @Test(groups= {"sanity"})
  public void a() {
	  Assert.fail();
	  Reporter.log("A is running", true);
  }
  
  @Test(groups= {"regression"})
  public void b() {
	  Reporter.log("B is running", true);
  }
  
  @Test(groups= {"sanity"})
  public void c() {
	  Reporter.log("C is running", true);
  }
  @Test(groups= {"regression"})
  public void d() {
	  Reporter.log("D is running", true);
  }
}
