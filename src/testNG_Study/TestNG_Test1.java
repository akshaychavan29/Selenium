package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG_Test1 {
	@Test
	  public void launchflipcart () throws InterruptedException
	  {
		//This is for chrome browser
//		  	System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
//			WebDriver driver= new ChromeDriver();
			
		//This is for firefox browser
			System.setProperty("webdriver.gecko.driver", "D:\\javaselenium\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();	
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(500);
			
	  }
  
}
