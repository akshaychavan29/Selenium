package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		CellType cellInfoType = myCell.getCellType();
		
		System.out.println(cellInfoType);
		
		System.out.println("=================================");
		
		String Value = myWorkbook.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Value);
	}

}
