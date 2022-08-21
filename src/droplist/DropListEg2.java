package droplist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropListEg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(1000);
		
		//identify element and store in ref variable
//		WebElement day = driver.findElement(By.id("day"));
		
		//create object of select class
//		Select s1=new Select(day);
//		
//		s1.selectByValue("29");       //use any of Select class method
//		Thread.sleep(3000);
//
//		WebElement month = driver.findElement(By.id("month"));
//		Select s2=new Select(month);
//		
//		s2.selectByVisibleText("May");
//		Thread.sleep(3000);
//		
		WebElement year = driver.findElement(By.id("year"));
	    Select s3=new Select(year);

		s3.selectByValue("1995");
		Thread.sleep(3000);

		// using for loop for multiple times operations
		for(int i=0;i<=9;i++)
		{
			s3.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		for(int i=9;i>=0;i--)
		{
			s3.selectByIndex(i);
			Thread.sleep(1000);
		}
		
	}

}
