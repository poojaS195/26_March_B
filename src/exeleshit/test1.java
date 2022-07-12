package exeleshit;

import java.awt.Point;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

File myfile=new File("E:\\Velocity\\sheet1.xlsx");
String name = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(name);
String name1= WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
System.out.println(name1);


	}

}
