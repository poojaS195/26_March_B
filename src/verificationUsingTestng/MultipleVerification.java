package verificationUsingTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void MyMethod() 
  {
	  String a="pune";
	  String b="pune";
	  
	  Assert.assertNotEquals(a, b,"a and b value are mathch Tc fail");
	  Assert.assertNotNull(b, "Tc fail");
  }
}
