package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserStudy
{
  @Parameters("BrowserName")
  @Test
  public void myMethod( String BName) 
  {
	  WebDriver driver=null;  // declared driver here
	  if(BName.equals("chrome"))
	  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		driver= new ChromeDriver();
	  }
	  else if(BName.equals("firefox"))
	  {
		
	  	System.setProperty("webdriver.gecko.driver", "D:\\javaselenium\\geckodriver.exe");
		driver= new FirefoxDriver();	
	  }
		
	  	driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
	  
	  
  }
}
