package kitetTESTNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBASE.BaseClass;
import kitePOM.KiteHomePage;
import kitePOM.KiteLoginPage;
import kitePOM.KitePinPage;
import kiteUTILITY.UtilityClass;

public class ValidateKiteUserID extends BaseClass
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser()
	{
		openApplication();
		UtilityClass.waitUse(driver, 1000);
		login =new KiteLoginPage(driver);
		pin =new KitePinPage(driver);
		home= new KiteHomePage(driver);
		Reporter.log("Launching browser",true);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.senduserID(UtilityClass.readDataFromExcel(0, 0));
		login.sendPassword(UtilityClass.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		UtilityClass.waitUse(driver, 1000);
		Reporter.log("logging done, entering into pin page",true);
		
		pin.sendpin(UtilityClass.readDataFromExcel(0, 2));
		pin.clickOnContinueButton();
		UtilityClass.waitUse(driver, 1000);
		Reporter.log("entering into home page",true);
	}
	
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
	  String TCID="123";
	  Assert.assertEquals(home.getActualUserID(), UtilityClass.readDataFromExcel(0, 0), "TC is failed, actual & expected userID are not Matching");
	  UtilityClass.captureScreenShot(driver, TCID);
	  Reporter.log("Tc is passed, validation is done",true);
  }
  
  @AfterMethod
  public void  logoutToKiteApp () throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("logging out from app",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("closing browser",true);
	  driver.close();
  }
  
}
