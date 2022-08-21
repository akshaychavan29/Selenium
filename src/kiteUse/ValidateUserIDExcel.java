package kiteUse;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserIDExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);	
		
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet6");
		String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys(UID);
		password.sendKeys(PWD);
		loginButton.click();
		Thread.sleep(500);	

		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
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
