package KiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Base;
import KiteBase.NewBase;

public class Listener extends NewBase implements ITestListener{
//WebDriver driver;
	NewBase b=new NewBase();
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("tc pass"+ result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("tc pass"+ result.getName(),true);
       String name = result.getName();
		try {
		b.capturescreenshot( name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
