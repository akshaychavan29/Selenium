package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Radio3']"));
		
		//act.moveToElement(radio).perform();
		//act.click().perform();
				
		//act.moveToElement(radio).click().build().perform();
				
		act.click(radio).perform();
		
		
		
	}

}
