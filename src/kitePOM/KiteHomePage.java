package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class KiteHomePage 
	{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UID;   //encapsulation concept .....make private to webelement
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	public KiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void validateUId(String expectedResult)
//	{
//		String actualResult = UID.getText();
//		System.out.println("actualResult is "+actualResult);
//		System.out.println("expectedResult is "+expectedResult);
//		if(expectedResult.equals(actualResult))
//		{
//			System.out.println("actualResult & expectedResult are matching, TC is PASS");
//		}
//		else
//		{
//			System.out.println("actualResult & expectedResult are not matching, TC is FAIL");
//		}
//	}
	
	public String getActualUserID()
	{
		String actualUserID = UID.getText();
		return actualUserID;
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		UID.click();
		Thread.sleep(500);
		logoutButton.click();
	}
	
}
