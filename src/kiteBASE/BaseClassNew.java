package kiteBASE;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import kiteUTILITY.UtilityClassNew;

public class BaseClassNew   //all new classes are created for properties file use
{
	protected  WebDriver driver;

	public void openApplication () throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(UtilityClassNew.readDataFromPropertyFile("URL"));
		driver.manage().window().maximize();
	}

}
