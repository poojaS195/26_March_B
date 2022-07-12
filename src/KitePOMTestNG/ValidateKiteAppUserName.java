package KitePOMTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
 
	 WebDriver driver;
	 Sheet mysheet;
	 KiteLoginPage login;
	 KiteAppPinPage pin;
	 KiteAppHomePage home;
	
	
	@BeforeClass
 public void lunchBrowser() throws EncryptedDocumentException, IOException
 {
	 System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
   driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://kite.zerodha.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

    File myfile=new File("E:\\Velocity\\sheet4.xlsx");
    Workbook book = WorkbookFactory.create(myfile);
   mysheet = book.getSheet("sheet1");

   login=new KiteLoginPage(driver);
   pin=new KiteAppPinPage(driver);
   home=new KiteAppHomePage(driver);
   
   
 }
	
	@BeforeMethod
 public void loginToKiteApp()
 {
      String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
     String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
	 String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();

	 
	 login.sendusername(UN);
	 login.sendpassword(PWD);
	 login.clickOnLoginButton();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	 pin.sendpin(PIN);
	 pin.contibutn();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	 
 }
	@Test
  public void validateUserName() 
	{
		String expectedUN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String actualUn=home.hetActualUserName();
		Assert.assertEquals(expectedUN, actualUn,"actual and expected are not match");
		Reporter.log("actual and expected are  match",true);
		
		
	}
	
	@AfterMethod
	public void logoutapp() throws InterruptedException
	{
		home.logoutbtn();
	}
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
