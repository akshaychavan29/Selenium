package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//1 by classname
		driver.findElement(By.className("header1 font-weight-bold text-white text-center"));
		
		//2 by id
		driver.findElement(By.id("dropdown-class-example"));
		
		//3 by name
		driver.findElement(By.name("enter-name"));
		
		//4 by xpath
		driver.findElement(By.xpath("//button[@id='openwindow']"));

		
		
		
		
	}

}
