package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login");
		
		WebElement mobileNumber = driver.findElement(By.id("mobileNumber"));
		mobileNumber.sendKeys("9011626246");
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(100));

		WebElement getOTP = driver.findElement(By.xpath("//button[@type='submit']"));
		//Thread.sleep(1000);
		w.until(ExpectedConditions.elementToBeClickable(getOTP));
		
		getOTP.click();
	}

}
