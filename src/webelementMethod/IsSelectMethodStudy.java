package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMethodStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement option1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		boolean result = option1.isSelected();
		System.out.println("option1 is selected "+result);
		
		Thread.sleep(2000);
//		option1.click();
		
		if(result)
		{
			System.out.println("option1 is selected"+result);
		}
		else
		{
			option1.click();
		}
	}

}
