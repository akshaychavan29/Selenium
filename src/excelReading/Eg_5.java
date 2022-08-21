package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");

		for(int i=0;i<=1;i++) //outer for loop--> for rows
		{
			for(int j=0;j<=2;j++)   //inner for loop--> for cells
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
		System.out.println();
		}
		
		
		
		
		
		
	}

}
