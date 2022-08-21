package kiteUTILITY;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass

{
	public static String readDataFromExcel (int rollNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet7").getRow(rollNum).getCell(cellNum).getStringCellValue();
		return value;
	}
	
	public static void captureScreenShot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\javaselenium\\screenshot\\snapshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	public static Timeouts waitUse(WebDriver driver, int seconds)
	{
	Timeouts wait = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(seconds));
	return wait;
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(seconds));
	}
	
}
