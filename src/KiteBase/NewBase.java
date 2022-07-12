package KiteBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import KiteUtility.NewUtilityprop;

public class NewBase {
    protected WebDriver driver;
	public void openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
	    driver=new ChromeDriver();
	   driver.manage().window().maximize();
	  Reporter.log("browser lunch",true);
	   driver.get(NewUtilityprop.getDataFromPropertiFile("URL"));
	  Reporter.log("lounching browser",true);
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		
		
	}
	

}
