package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

		System.out.println(value);
		System.out.println(value1);
	}
	

}
