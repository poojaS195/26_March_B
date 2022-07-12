package verificationUsingTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class verificationRadioButton {
 
	 @Test
	  public void mymethod()
	  {
		  
		  System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Radio1']"));
//	if(radiobutton.isSelected())
//	{
//		Reporter.log("selected pass", true);
//	}
//	else
//	{
//		Reporter.log("not selected fail", true);
//	}
	  Assert.assertTrue(radiobutton.isSelected(),"radio button not selected");
	  
	  
	  }
}
