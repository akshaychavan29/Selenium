package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(4000);
		WebElement Signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Signin.click();
		
		Thread.sleep(4000);
		
		WebElement GetOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = GetOTP.isEnabled();
		System.out.println("OTP is enable "+result);
		Thread.sleep(3000);
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
//		mobileNumber.sendKeys("9011626246");
//		Thread.sleep(3000);
		
//		boolean result1 = GetOTP.isEnabled();
//		System.out.println("OTP is enable "+result1);
		
		if(result)
		{
			System.out.println("OTP is enable "+result);
		}
		else
		{
			mobileNumber.sendKeys("9011626246");
		}
		GetOTP.click();
			

			
			
			
		
		
	}

}
