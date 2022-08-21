package kiteBASE;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteUTILITY.UtilityClassNew;

public class BaseClassNew2   //all new classes are created for properties file use
{
	protected static WebDriver driver;

	public void openApplication () throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(UtilityClassNew.readDataFromPropertyFile("URL"));
		driver.manage().window().maximize();
	}
	
	public  void captureScreenShot(String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\javaselenium\\screenshot\\snapshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}

}
