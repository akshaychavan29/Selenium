package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		int totalRows = mySheet.getLastRowNum();
		System.out.println("Total Number of rows are "+totalRows);
		
		int totalCell = mySheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total Number of cells are "+totalCell);
		System.out.println("========================");
		// Dynamic coding for reading complete excel
		
		for(int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<=totalCell;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
	}

}
