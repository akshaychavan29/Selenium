package droplist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
		WebElement multiselect = driver.findElement(By.id("cars"));
		 
		//I want to check if this is multiple selectable or not
		Select s= new Select(multiselect);
		
		System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		Thread.sleep(1000);

		s.selectByValue("opel");
		Thread.sleep(1000);

		s.selectByVisibleText("Audi");
		Thread.sleep(1000);

		
		//s.deselectAll();      // deselect particular value
		
		s.deselectByIndex(0);
		
		
		
	}

}
