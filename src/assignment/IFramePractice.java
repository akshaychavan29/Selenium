package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class IFramePractice {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("IFramePractice");
		Thread.sleep(1000);

		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		String GetText = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(GetText);
		
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.id("animals"));
		Select s=new Select(name);
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
		File dest=new File("D:\\javaselenium\\screenshot\\snapshot"+random+".jpg");
		FileHandler.copy(src, dest);
	}

}
