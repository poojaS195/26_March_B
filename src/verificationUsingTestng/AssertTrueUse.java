package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod() 
  {
	  boolean a=true;
	  boolean b=false;
//	  
//	  Assert.assertTrue(b, "TC is fail value is false");
//      Reporter.log("TC is pass value is true",true);
  
	  Assert.assertFalse(b, "TC is faile");
	  Reporter.log("Tc Is pass value is fail ",true);
	  
  }
}
