package kiteUTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;

public class UtilityClassNew
{
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream myFile= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\9th_APR_EVEN_selenium\\myProperty.properties");
		prop.load(myFile);  // loaded the file
		String value = prop.getProperty(key);
		return value;
	}
	
	public static void captureScreenShot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\javaselenium\\screenshot\\snapshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void waitUse(WebDriver driver,int time)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

}
