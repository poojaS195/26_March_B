package kiteapptest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteappusingexel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File myfile=new File("E:\\Velocity\\sheet4.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		
		
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(1000);
        WebElement username = driver.findElement(By.id("userid"));
WebElement password = driver.findElement(By.id("password"));
	WebElement sublit = driver.findElement(By.xpath("//button[@type='submit']"));
	username.sendKeys(UN);
	password.sendKeys(PWD);
	sublit.click();
    Thread.sleep(1000);
   WebElement pin = driver.findElement(By.id("pin"));
WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));
pin.sendKeys(PIN);
continu.click();
Thread.sleep(1000);
WebElement usernm = driver.findElement(By.xpath("//span[@class='user-id']"));
String actualid = usernm.getText();
String exceptedid = UN;
if(actualid.equals(exceptedid))
{
	System.out.println("id matching");
}
else
{
	System.out.println("id not matching");
}
usernm.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@target='_self']")).click();
Thread.sleep(1000);
driver.close();
	}

}
