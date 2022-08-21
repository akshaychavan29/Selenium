package kiteUsingPOMExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("headless");
		//opt.addArguments("disable-notifications");
		//opt.addArguments("incognito");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);
		
		File myFile=new File("D:\\9th_April_evening_Test.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet6"); //used personal 
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.senduserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnLoginButton();
		Thread.sleep(500);
		
		KitePinPage pin= new KitePinPage(driver);
		pin.sendpin(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnContinueButton();
		Thread.sleep(500);
		
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUId(mySheet.getRow(0).getCell(0).getStringCellValue());
		home.clickOnLogoutButton();
		
		driver.close();
		
		
	}

}
