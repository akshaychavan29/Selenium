package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 

{
	//1. Data member should be declared globally with access level private using @findBy Annotation

	@FindBy(id = "pin") WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")  WebElement contiueButton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KitePinPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	
	public void sendPin()
	{
		pin.sendKeys("982278");
	}
	
	public void clickOnConctinueButton() 
	{
		contiueButton.click();
	}
	
}
