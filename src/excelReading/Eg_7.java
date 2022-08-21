package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_7 {   // all kind of data reading, dynamic

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		
		int totalRows = mySheet.getLastRowNum();
		System.out.println("Total Number of rows are "+totalRows);
		
		int totalCell = mySheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total Number of cells are "+totalCell);
		System.out.println("=============================================================");
		
		for(int i=0;i<=totalRows;i++) 
		{
			for(int j=0;j<=totalCell;j++)
			{
			 Cell myCell = mySheet.getRow(i).getCell(j);
			 CellType cellDataType = myCell.getCellType();
			 
			 if(cellDataType==CellType.STRING)
			 {
				 String value = myCell.getStringCellValue();
				 System.out.print(value+" | ");
			 }
			 else if (cellDataType==CellType.NUMERIC)
			 {
				 double value = myCell.getNumericCellValue();
				 System.out.print(value+" | ");
		   	 }
			 else if (cellDataType==CellType.BOOLEAN)
			 {
				 boolean value = myCell.getBooleanCellValue();
				 System.out.print(value+" | ");
			 }
			 else if (cellDataType==CellType.BLANK)
			 {
				System.out.print(" | ");
			 }
			}
			System.out.println();

		}
	}

}
