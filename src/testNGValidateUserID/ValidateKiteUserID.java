package testNGValidateUserID;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserID 
{
	WebDriver driver;
	File myFile;
	Sheet mysheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	 
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		driver.manage().window().maximize();
		Reporter.log("Launchng kite app",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		myFile=new File("D:\\9th_April_evening_Test.xlsx");
		mysheet = WorkbookFactory.create(myFile).getSheet("Sheet7");
		login =new KiteLoginPage(driver);
		pin =new KitePinPage(driver);
		home =new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKite()
	{
		login.senduserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering user ID",true);
		login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering password",true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Entering pin",true);
		pin.clickOnContinueButton();
		Reporter.log("Clicking on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
  @Test
  public void validateUserID() 
  {
	  String actualUserID = home.getActualUserID();
	  String expectedUserID = mysheet.getRow(0).getCell(0).getStringCellValue();
	  Reporter.log("Validating actualUserID & expectedUserID",true);
	  Assert.assertEquals(actualUserID, expectedUserID,"actualUserID & expectedUserID are not matching, TC is failed");
	  Reporter.log("Validating actualUserID & expectedUserID, TC is passed",true);
  }
  
  @AfterMethod
  public void logoutKite() throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Thread.sleep(2000);
	  Reporter.log("Clicking on logout button",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	  Reporter.log("Closing Browser",true);
  }
  
}
