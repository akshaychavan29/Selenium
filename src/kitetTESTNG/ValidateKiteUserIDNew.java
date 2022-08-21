package kitetTESTNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBASE.BaseClassNew;
import kitePOM.KiteHomePage;
import kitePOM.KiteLoginPage;
import kitePOM.KitePinPage;
import kiteUTILITY.UtilityClass;
import kiteUTILITY.UtilityClassNew;

public class ValidateKiteUserIDNew extends BaseClassNew
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openApplication();
		UtilityClassNew.waitUse(driver, 1000);
		login =new KiteLoginPage(driver);
		pin =new KitePinPage(driver);
		home= new KiteHomePage(driver);
		Reporter.log("Launching browser",true);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.senduserID(UtilityClassNew.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityClassNew.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		UtilityClassNew.waitUse(driver, 1000);
		Reporter.log("logging done, entering into pin page",true);
		
		pin.sendpin(UtilityClassNew.readDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		UtilityClassNew.waitUse(driver, 1000);
		Reporter.log("entering into home page",true);
	}
	
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
	  String TCID="12345";
	  Assert.assertEquals(home.getActualUserID(), UtilityClassNew.readDataFromPropertyFile("UN"), "TC is failed, actual & expected userID are not Matching");
	  UtilityClassNew.captureScreenShot(driver, TCID);
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
