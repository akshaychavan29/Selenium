package testNGSerial_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kite {
  @Test
  public void kiteLaunch() throws InterruptedException 
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
	  	WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);
  }
}
