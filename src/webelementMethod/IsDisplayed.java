package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		
		boolean result = TextBox.isDisplayed();
		System.out.println("Textbox is displayed "+result);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		
		
		if(result)
		{
			System.out.println("Textbox is displayed");
			TextBox.sendKeys("Welcome");
		}
		else
		{
			System.out.println("Textbox is not displayed clicking on show button");
			showButton.click();
			TextBox.sendKeys("Welcome again");
		}
		
		
	}

}
