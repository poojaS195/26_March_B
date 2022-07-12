package pratice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zeroda {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
File myfile=new File("E:\\Velocity\\sheet4.xlsx");
Workbook book = WorkbookFactory.create(myfile);
Sheet mysheet = book.getSheet("sheet1");
String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();

System.setProperty("webdriver.chrome.driver", "E:\\\\installable\\\\chromedriver\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
Thread.sleep(1000);
WebElement userid = driver.findElement(By.id("userid"));
WebElement password = driver.findElement(By.id("password"));
WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
userid.sendKeys(UN);
password.sendKeys(PWD);
submit.click();
Thread.sleep(1000);
WebElement ppin = driver.findElement(By.id("pin"));
ppin.sendKeys(PIN);
WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
submitbutton.click();
Thread.sleep(1000);
List<WebElement> alllink = driver.findElements(By.tagName("a"));
System.out.println(alllink.size());
Iterator<WebElement> it = alllink.iterator();
while(it.hasNext())
{
	System.out.println(it.next().getText());
}
Thread.sleep(1000);
//String main = driver.getWindowHandle();
//System.out.println(main);
driver.findElement(By.xpath("//a[@class='orders-nav-item']")).click();


	}

}
