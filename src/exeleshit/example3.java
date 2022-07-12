package exeleshit;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile=new File("E:\\Velocity\\sheet3.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		
		int totalnoofrows = mysheet.getLastRowNum();
		int rowcount = totalnoofrows;
		System.out.println("totalnoofrows"+totalnoofrows);
       short totalnoofcells = mysheet.getRow(totalnoofrows).getLastCellNum();
       int cellcount = totalnoofcells-1;
        System.out.println("totalnoofcells"+totalnoofcells);
	for(int i=0;i<=rowcount;i++)
	{
		for(int j=0;j<=cellcount;j++)
		{
			
			Cell cellvalue = mysheet.getRow(i).getCell(j);
			if(cellvalue!=null)
			{
			CellType datatypr = cellvalue.getCellType();
			if(datatypr==CellType.STRING)
			{
				String value = cellvalue.getStringCellValue();
			System.out.print(value+" ");
			}
			else if(datatypr==CellType.NUMERIC)
			{

              double value = cellvalue.getNumericCellValue();
						System.out.print(value+" ");
			}
			else if(datatypr==CellType.BOOLEAN)
			{

                boolean value = cellvalue.getBooleanCellValue();
						System.out.print(value+" ");
			}
			}
			else
			{
				System.out.print(" ++  ");
			}
			
//			else if(datatypr==CellType.BLANK)
//			{
//
//                 System.out.print("   ");
//			}
		
		}
			System.out.println();

	}
		//System.out.println();
	
	}
	}

