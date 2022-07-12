package TestNgPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void mymethod()
  {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
  }
  @Test
  public void method1()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
  }
  
}
