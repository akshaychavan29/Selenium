package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		//Thread.sleep(1000);
		
		WebElement review = driver.findElement(By.xpath("//a[text()='Student Review']"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));

		w.until(ExpectedConditions.visibilityOf(review));
				
		
		
		
	}

}
