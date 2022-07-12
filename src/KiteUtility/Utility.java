package KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	//excel
	//screenshot
	//closing
	


	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException {
		 File myfile=new File("E:\\Velocity\\sheet4.xlsx");
		    Workbook book = WorkbookFactory.create(myfile);
		 Sheet mysheet = book.getSheet("sheet1");
		 String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	      return value;
	}
	
	public static void capturescreenshot(WebDriver driver,String tCid) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\screenshot\\png\\myscreenshot"+tCid+".png");
		FileHandler.copy(scr, dest);
	
	}


	
	
	
}
