package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod()
  {
	  String a="pune";
	  String b="pune";
	  
	// Assert.assertEquals(a, b,"two strings are not match");
    // Reporter.log("two strings are  match");
  
  Assert.assertNotEquals(a, b,"a and b value are matvching test case is fail");
 Reporter.log("a and b value are not match test case is pass",true);
  }
}
