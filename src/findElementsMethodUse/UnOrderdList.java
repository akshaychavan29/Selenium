package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderdList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("mercedes");
		Thread.sleep(1000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));  //absolute path thats why single slash
		
		System.out.println(result.size());
		
		for(WebElement r:result)
		{
			System.out.println(r.getText()); // to see list in console
		}

		for(WebElement r:result) // to click on specific item-->mercedes 
		{
			 String expectedResult = "Mercedes";
			 String actualText = r.getText();
			
			if(actualText.equals(expectedResult))
			{
				r.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();

	}

}
