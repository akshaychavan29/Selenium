package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupHandleByAddArgument {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("disable-popup-blocking");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("one plus mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
}
