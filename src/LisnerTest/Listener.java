package LisnerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
@Override
public void onTestFailure(ITestResult result) {

	Reporter.log("ss taken",true);
	Reporter.log("fail tc name is"+ result.getName(),true);

}
@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("TC pass",true);
	Reporter.log("pass tc name is"+ result.getName(),true);

	}
@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("TC skipped",true);
	Reporter.log("skipped tc name is"+ result.getName(),true);

	}
}
