package kiteapppomexel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

File myfile=new File("E:\\Velocity\\sheet4.xlsx");
Workbook book = WorkbookFactory.create(myfile);
Sheet mysheet = book.getSheet("sheet1");

String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();

System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://kite.zerodha.com/");
Thread.sleep(1000);


kiteapploginpage login=new kiteapploginpage(driver);
login.senduserid(UN);
login.sendpassword(PWD);
login.clickloginbtn();
Thread.sleep(1000);

KiteAppPinpage pinpg=new KiteAppPinpage(driver);
pinpg.sendpin(PIN);
pinpg.clickcontinuebutn();
Thread.sleep(1000);

kiteAppHomepage homepg=new kiteAppHomepage(driver);
homepg.matchuserID(UN);
homepg.clickuserid();
Thread.sleep(1000);



	}

}
