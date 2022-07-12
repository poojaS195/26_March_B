package verificationUsingTestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod()
  {
	  String a="abc";
	  String b="abc";
	  
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a, b,"both are equls TC is fail");
	  soft.assertNull(b,"value is not null,TC is fail");
      soft.assertAll();
  }
  
  @Test
  public void testing()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(b, "value is false TC is fail");
	  s.assertFalse(a, "value is true TC is fail");
	  s.assertAll();
  
  
  }
}
