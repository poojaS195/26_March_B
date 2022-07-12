package LisnerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(LisnerTest.Listener.class)
public class MyTestNg {
  @Test
  public void Mymethod1() {
	  Reporter.log("hii am method1",true);
  }
  @Test
  public void Mymethod2() {
	  Assert.fail();
	  Reporter.log("hii am method2",true);
  }
  @Test(dependsOnMethods = "Mymethod2")
  public void Mymethod3() {
	  Reporter.log("hii am method3",true);
  }
  
}
