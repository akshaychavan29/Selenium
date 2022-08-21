package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");

		CellType value1 = mysheet.getRow(1).getCell(0).getCellType();
		System.out.println(value1);
		String value11 = mysheet.getRow(1).getCell(0).getStringCellValue();	
		System.out.println(value11);
		System.out.println("========================");
		
		CellType value2 = mysheet.getRow(1).getCell(1).getCellType();
		System.out.println(value2);
		double value22 = mysheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value22);
		System.out.println("========================");

		
		CellType value3 = mysheet.getRow(1).getCell(2).getCellType();
		System.out.println(value3);
		boolean value33 = mysheet.getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(value33);
		System.out.println("========================");

	}

}
