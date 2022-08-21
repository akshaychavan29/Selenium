package kitetTESTNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBASE.BaseClassNew;
import kiteBASE.BaseClassNew2;
import kitePOM.KiteHomePage;
import kitePOM.KiteLoginPage;
import kitePOM.KitePinPage;
import kiteUTILITY.UtilityClass;
import kiteUTILITY.UtilityClassNew;
import kiteUTILITY.UtilityClassNew2;

@Listeners(kiteBASE.Listner.class)
public class ValidateKiteUserIDNew2 extends BaseClassNew2
{
	KiteLoginPage login; //this new2 is created for take ss of listner failed TC or methods 
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openApplication();
		UtilityClassNew2.waitUse(driver, 1000);
		login =new KiteLoginPage(driver);
		pin =new KitePinPage(driver);
		home= new KiteHomePage(driver);
		Reporter.log("Launching browser",true);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.senduserID(UtilityClassNew2.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityClassNew2.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		UtilityClassNew2.waitUse(driver, 1000);
		Reporter.log("logging done, entering into pin page",true);
		
		pin.sendpin(UtilityClassNew2.readDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		UtilityClassNew2.waitUse(driver, 1000);
		Reporter.log("entering into home page",true);
	}
	
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
	  String TCID="123";
	  Assert.assertEquals(home.getActualUserID(), UtilityClassNew2.readDataFromPropertyFile("UN1"), "TC is failed, actual & expected userID are not Matching");
	  //UtilityClassNew2.captureScreenShot(driver, TCID);
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
