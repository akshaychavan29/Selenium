package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(xpath = "//span[@class='user-id']") WebElement UId;
	@FindBy(xpath = "//a[@target='_self']") WebElement logoutButton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public

	public void validatingUId()
	{
		String actualResult = UId.getText();
		System.out.println("actualResult are "+actualResult);
		String expectedResult = "ELR321";
		System.out.println("expectedResult are "+expectedResult);
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("actualResult & expectedResult are matched, Test case is pass");
		}
		else
		{
			System.out.println("actualResult & expectedResult are not matched, Test case is fail");
		}
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		UId.click();
		Thread.sleep(500);	
		logoutButton.click();
	}
	
}
