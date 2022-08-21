package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
//		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
	
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
	}

}
