package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//5 by linktext
		//driver.findElement(By.linkText("Gmail")).click();
	   
		//6 by partial linktext
		driver.findElement(By.partialLinkText("Gma")).click();
		
	}

}
