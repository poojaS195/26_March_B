package KiteBase;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	public WebDriver driver;
     
	public void openbrowser()
	{
	
		
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
	    driver=new ChromeDriver();
	   driver.manage().window().maximize();
	  Reporter.log("browser lunch",true);
	   driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
    
	
}
