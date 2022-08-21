package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.Create object of Actions class and pass driver object as parameter
		Actions act=new  Actions(driver);
		
		//2. Find the Element to be worked and store in reference variable
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//3. take the required action
		
		//act.contextClick(rightClickMe).perform();
		act.moveToElement(rightClickMe).contextClick().build().perform();
			
	}

}
