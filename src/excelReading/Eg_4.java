package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
	
		//reading multiple data from single row
		for(int i=0;i<=2;i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
		}
		System.out.println("=======================");
		
		//reading multiple data from single column
		for(int i=0;i<=1;i++)
		{
		String value = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
		}
	}

}
