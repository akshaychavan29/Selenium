package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollForSendkeys_Click {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='Radio3']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//1.sendkeys & click action by using JavascriptExecutor -Method 1
		
		js.executeScript("arguments[0].scrollIntoView", textbox);
		Thread.sleep(1000);

		js.executeScript("arguments[0].value='Akshay';",textbox);
		js.executeScript("arguments[0].click();",radioButton);

		//2.sendkeys & click action by using JavascriptExecutor -Method 2
		
//		js.executeScript("arguments[0].scrollIntoView();",textbox);
//		textbox.sendKeys("Akshay");
//		Thread.sleep(1000);
//		
//		js.executeScript("arguments[0].scrollIntoView();",radioButton);
//		radioButton.click();

	}

}
