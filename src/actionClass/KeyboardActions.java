package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		
		//1. Create object of ACtions class
		Actions act=new Actions(driver);
		
		//2. Find Element
		WebElement day = driver.findElement(By.id("day"));
		
		//3. Take required action
		act.click(day).perform();
		
		for(int i=1;i<=21;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(400);
		}

		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		
		for(int i=1;i<=2;i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(400);
		}

		WebElement year = driver.findElement(By.id("year"));
		act.click(year).perform();
		
		for(int i=1;i<=27;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		}
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		act.click(gender).perform();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chavan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9011626246");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
		
	}

}
