package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);	
		
		KiteLoginPage login=new KiteLoginPage(driver);
		 
		login.sendUserId();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(500);	

		KitePinPage pin =new KitePinPage(driver);
		
		pin.sendPin();
		pin.clickOnConctinueButton();
		Thread.sleep(500);	

		KiteHomePage home=new KiteHomePage(driver);
		
		home.validatingUId();
		home.clickOnLogoutButton();
		
		driver.quit();
		
	}

}
