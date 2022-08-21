package kiteUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserID {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);	
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys("NNS169");
		password.sendKeys("akshay.chavan73932");
		loginButton.click();
		Thread.sleep(500);	

		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("007061");
		continueButton.click();  
		Thread.sleep(500);	

		WebElement uID = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualResult = uID.getText();
		System.out.println("actualResult are "+actualResult);
		String expectedResult = "NNS169";
		System.out.println("expectedResult are "+expectedResult);
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("actualResult & expectedResult are matched, Test case is pass");
		}
		else
		{
			System.out.println("actualResult & expectedResult are not matched, Test case is fail");
		}
		
		uID.click();
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		
		driver.close();
	}

}
