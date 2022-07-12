package TestNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
 
	@Test
	public void d()
	{
		Assert.fail();
	Reporter.log("d is running",true);
	
	}
	@Test(enabled = false )
	public void a()
	{
	Reporter.log("a is running",true);
	}
	@Test(dependsOnMethods = "d")
	public void v()
	{
	Reporter.log("v is running",true);
	}
}
