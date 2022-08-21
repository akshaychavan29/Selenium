package testNGSerial_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipcart {
	@Test
	  public void flipcartLaunch() throws InterruptedException 
	  {
		  	System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		  	WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(500);
	  }
}
