package kiteBASE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 

{
	protected WebDriver driver;

	public void openApplication ()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		driver.manage().window().maximize();
	}
	
	
	
	
}
