package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		//1. Create an object of ACtions Class
		Actions act=new Actions(driver);
		
		//2. Find Elements to be worked
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		//3. take the required action
		//act.dragAndDrop(src, dest).perform();
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
	}

}
