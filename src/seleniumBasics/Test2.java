package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("akshay.chavan73932");
		
		driver.findElement(By.id("pass")).sendKeys("9422294195");
		
	}

}
