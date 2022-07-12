package FacebookPOM;

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

File myfile=new File("E:\\Velocity\\facebook.xlsx");
Workbook mybook = WorkbookFactory.create(myfile);
Sheet mysheet = mybook.getSheet("sheet1");

String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();


System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(1000);

facebookLoginPage fl=new facebookLoginPage(driver);
fl.sendusername(UN);
fl.sendpasswrd(PWD);
fl.clicklogin();




	}

}
