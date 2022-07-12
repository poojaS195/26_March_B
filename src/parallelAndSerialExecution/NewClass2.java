package parallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass2 {
	 @Test
	  public void method()
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html#skills");
	  }
}
