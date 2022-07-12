package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod()
  {
	  String a=null;
	  String b="abc";
	  
//	  Assert.assertNull(a, "value is not null Tc Is fail");
//      Reporter.log("value is null Tc IS pass",true);
  
	  Assert.assertNotNull(b, "TC is Fail value is null");
	  Reporter.log("value is not null TC is pass");
 //Assert.fail();//give this then tc is fail with no error msg
  }
}
